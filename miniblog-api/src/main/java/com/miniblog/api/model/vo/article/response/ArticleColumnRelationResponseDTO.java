package com.miniblog.api.model.vo.article.response;

import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @description: 给定文章id查询对应专栏信息的响应对象
 */

@Tag(name = "文章专栏关联的响应对象", description = "给定文章id查询对应专栏信息的响应对象")
public record ArticleColumnRelationResponseDTO(
        // 专栏id
        Long columnId,
        // 文章id
        Long articleId,
        // 章节号
        Integer section,
        // 阅读类型
        Integer readType
) {

}
