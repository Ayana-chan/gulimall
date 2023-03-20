package cn.ayana.gulimall.product.service.impl;

import cn.ayana.gulimall.product.vo.CategoryTreeListVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.ayana.gulimall.common.utils.PageUtils;
import cn.ayana.gulimall.common.utils.Query;

import cn.ayana.gulimall.product.dao.CategoryDao;
import cn.ayana.gulimall.product.entity.CategoryEntity;
import cn.ayana.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryTreeListVO> listWithTree() {

        List<CategoryEntity> entities = baseMapper.selectList(null);
        //转换为VO的List
        List<CategoryTreeListVO> VOs=entities.stream().map(categoryEntity -> {
            //转换类型并赋予children值
            CategoryTreeListVO menu=new CategoryTreeListVO();
            BeanUtils.copyProperties(categoryEntity, menu);
            return menu;
        }).collect(Collectors.toList());

        //递归获取树表（最高层的parentCid为0）
        List<CategoryTreeListVO> menus = getChildren(0,VOs);

        return menus;
    }

    @Override
    public void removeMenuByIds(List<Long> asList) {
        //TODO: 检查当前删除的菜单是否被引用

        baseMapper.deleteBatchIds(asList);
    }

    private List<CategoryTreeListVO> getChildren(long aimParentCid,List<CategoryTreeListVO> all){

        List<CategoryTreeListVO> menus = all.stream().filter(categoryEntity ->
                        categoryEntity.getParentCid().equals(aimParentCid)
                ).peek(menu -> {
                    //转换类型并赋予children值
                    menu.setChildren(getChildren(menu.getCatId(),all));
                }).sorted((menu1,menu2)->{
                    //根据sort值排序
                    return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
                })
                .collect(Collectors.toList());

        return menus;
    }

}