package cn.ayana.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author ayana
 * @email yychen_114@stu.xidian.edu.cn
 * @date 2023-02-18 20:01:38
 */
@Data
@TableName("undo_log")
public class UndoLogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 
	 */
	private Long branchId;
	/**
	 * 
	 */
	private String xid;
	/**
	 * 
	 */
	private String context;
	/**
	 * 
	 */
	private byte[] rollbackInfo;
	/**
	 * 
	 */
	private Integer logStatus;
	/**
	 * 
	 */
	private Date logCreated;
	/**
	 * 
	 */
	private Date logModified;
	/**
	 * 
	 */
	private String ext;

}
