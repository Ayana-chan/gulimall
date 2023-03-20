package cn.ayana.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.ayana.gulimall.common.utils.PageUtils;
import cn.ayana.gulimall.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author ayana
 * @email yychen_114@stu.xidian.edu.cn
 * @date 2023-02-18 21:46:47
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

