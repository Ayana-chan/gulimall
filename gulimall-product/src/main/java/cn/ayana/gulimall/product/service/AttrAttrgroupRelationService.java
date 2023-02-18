package cn.ayana.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.ayana.common.utils.PageUtils;
import cn.ayana.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author ayana
 * @email yychen_114@stu.xidian.edu.cn
 * @date 2023-02-18 20:01:38
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

