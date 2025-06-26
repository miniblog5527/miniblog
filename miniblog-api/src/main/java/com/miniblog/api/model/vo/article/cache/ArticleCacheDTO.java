package com.miniblog.api.model.vo.article.cache;

import com.miniblog.api.model.vo.article.dto.ArticleDTO;
import lombok.Data;

@Data
public class ArticleCacheDTO {

    /**
     * 文章信息
     */
    private ArticleDTO article;

    /**
     * 所属专栏id
     */
    private Long columnId;

    /**
     * 所属专栏中的文章的id
     */
    private Integer sectionId;

}
