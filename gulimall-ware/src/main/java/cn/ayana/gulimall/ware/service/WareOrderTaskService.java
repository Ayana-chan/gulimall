package cn.ayana.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.ayana.gulimall.common.utils.PageUtils;
import cn.ayana.gulimall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author ayana
 * @email yychen_114@stu.xidian.edu.cn
 * @date 2023-02-18 22:16:38
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

