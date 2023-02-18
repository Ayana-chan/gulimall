package cn.ayana.gulimall.order.dao;

import cn.ayana.gulimall.order.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author ayana
 * @email yychen_114@stu.xidian.edu.cn
 * @date 2023-02-18 22:12:59
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
