package cn.ayana.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.ayana.common.utils.PageUtils;
import cn.ayana.gulimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author ayana
 * @email yychen_114@stu.xidian.edu.cn
 * @date 2023-02-18 22:12:59
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

