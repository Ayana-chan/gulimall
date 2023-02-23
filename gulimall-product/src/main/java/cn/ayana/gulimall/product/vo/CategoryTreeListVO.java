package cn.ayana.gulimall.product.vo;

import cn.ayana.gulimall.product.entity.CategoryEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 用于表示分类树
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CategoryTreeListVO extends CategoryEntity {
    /**
     * 子树
     */
    private List<CategoryTreeListVO> children;
}
