package cn.ayana.gulimall.member.dao;

import cn.ayana.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ayana
 * @email yychen_114@stu.xidian.edu.cn
 * @date 2023-02-18 21:54:07
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
