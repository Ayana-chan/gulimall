package cn.ayana.gulimall.product.entity;

import cn.ayana.gulimall.common.valid.AddGroup;
import cn.ayana.gulimall.common.valid.ListValue;
import cn.ayana.gulimall.common.valid.UpdateGroup;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

/**
 * 品牌
 *
 * @author ayana
 * @email yychen_114@stu.xidian.edu.cn
 * @date 2023-02-18 20:01:38
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     */
    @NotNull(message = "修改必须有ID", groups = {UpdateGroup.class})
//	@Null(message = "新增不能有ID",groups = {AddGroup.class})
    @TableId
    private Long brandId;
    /**
     * 品牌名
     */
    @NotBlank(message = "品牌名字不能为空", groups = {AddGroup.class})
    private String name;
    /**
     * 品牌logo地址
     */
    @NotBlank(groups = {AddGroup.class})
    @URL(groups = {UpdateGroup.class, AddGroup.class})
    private String logo;
    /**
     * 介绍
     */
    private String descript;
    /**
     * 显示状态[0-不显示；1-显示]
     */
    @NotNull(groups = {AddGroup.class})
    @ListValue(vals = {0, 1}, groups = {UpdateGroup.class, AddGroup.class}) //自定义校验注解
    private Integer showStatus;
    /**
     * 检索首字母
     */
    @NotNull(groups = {AddGroup.class})
    @Pattern(regexp = "^[a-zA-Z]$", groups = {UpdateGroup.class, AddGroup.class})
    private String firstLetter;
    /**
     * 排序
     */
    @NotNull(groups = {AddGroup.class})
    private Integer sort;

}
