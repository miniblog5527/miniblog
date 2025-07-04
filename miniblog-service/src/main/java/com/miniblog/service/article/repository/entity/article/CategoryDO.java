package com.miniblog.service.article.repository.entity.article;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.miniblog.api.model.entity.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 类目管理表
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("category")
public class CategoryDO extends BaseDO {
    private static final long serialVersionUID = 1L;

    /**
     * 类目名称
     */
    private String categoryName;

    /**
     * 状态：0-未发布，1-已发布
     */
    private Integer status;

    /**
     * 排序
     */
    @TableField("`rank`")
    private Integer rank;

    private Integer deleted;
}
