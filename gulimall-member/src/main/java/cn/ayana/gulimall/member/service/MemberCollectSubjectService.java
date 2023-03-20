package cn.ayana.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.ayana.gulimall.common.utils.PageUtils;
import cn.ayana.gulimall.member.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author ayana
 * @email yychen_114@stu.xidian.edu.cn
 * @date 2023-02-18 21:54:07
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

