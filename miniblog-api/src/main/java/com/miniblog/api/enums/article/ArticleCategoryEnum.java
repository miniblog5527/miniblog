package com.miniblog.api.enums.article;

import lombok.Getter;

/**
 * @Author: hunter
 * @Description: 文章分类枚举的特殊常量
 */
@Getter
public class ArticleCategoryEnum {
    /**
     * 全部
     */
    public static final String CATEGORY_ALL = "全部";

    private final String categoryName;

    ArticleCategoryEnum(String categoryName) {
        this.categoryName = categoryName;
    }
}
