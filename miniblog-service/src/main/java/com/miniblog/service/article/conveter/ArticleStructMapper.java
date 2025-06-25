package com.miniblog.service.article.conveter;

import com.miniblog.api.vo.article.SearchArticleReq;
import com.miniblog.service.article.repository.params.SearchArticleParams;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ArticleStructMapper {
    // 获取ArticleStructMapper的实例
    ArticleStructMapper INSTANCE = Mappers.getMapper(ArticleStructMapper.class);

    // 将SearchArticleReq转换为SearchArticleParams
    @Mapping(source = "pageNumber", target = "pageNum")
    SearchArticleParams toSearchArticleParams(SearchArticleReq req);
}
