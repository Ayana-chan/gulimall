package cn.ayana.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.ayana.common.utils.PageUtils;
import cn.ayana.gulimall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author ayana
 * @email yychen_114@stu.xidian.edu.cn
 * @date 2023-02-18 21:46:47
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

