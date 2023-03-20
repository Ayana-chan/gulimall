package cn.ayana.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.ayana.gulimall.common.utils.PageUtils;
import cn.ayana.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author ayana
 * @email yychen_114@stu.xidian.edu.cn
 * @date 2023-02-18 21:54:07
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

