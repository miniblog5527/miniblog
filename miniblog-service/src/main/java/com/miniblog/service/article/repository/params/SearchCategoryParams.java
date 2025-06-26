package com.miniblog.service.article.repository.params;


import com.miniblog.api.model.vo.PageParam;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 微信搜索「沉默王二」，回复 Java
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SearchCategoryParams extends PageParam {
    // 类目名称
    private String category;
}
