package com.miniblog.service.article.service;

import com.miniblog.api.model.vo.article.ColumnArticleReq;
import com.miniblog.api.model.vo.article.ColumnReq;

public interface ColumnArticleService {

    void addColumnArticle(Long columnId, Long articleId);

    void deleteColumnArticle(Long columnId, Long articleId);
}
