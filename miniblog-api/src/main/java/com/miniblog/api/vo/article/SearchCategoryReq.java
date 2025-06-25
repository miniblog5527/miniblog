package com.miniblog.api.vo.article;

import lombok.Data;

/**
 * 微信搜索「沉默王二」，回复 Java
 */
@Data
public class SearchCategoryReq {
    // 类目名称
    private String category;
    // 分页
    private Long pageNumber;
    private Long pageSize;

}
