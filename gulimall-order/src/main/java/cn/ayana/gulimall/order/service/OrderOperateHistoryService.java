package cn.ayana.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.ayana.gulimall.common.utils.PageUtils;
import cn.ayana.gulimall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author ayana
 * @email yychen_114@stu.xidian.edu.cn
 * @date 2023-02-18 22:12:59
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

