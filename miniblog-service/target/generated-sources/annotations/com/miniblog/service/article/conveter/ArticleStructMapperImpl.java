package com.miniblog.service.article.conveter;

import com.miniblog.api.vo.article.SearchArticleReq;
import com.miniblog.service.article.repository.params.SearchArticleParams;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-25T20:18:50+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.15 (Amazon.com Inc.)"
)
public class ArticleStructMapperImpl implements ArticleStructMapper {

    @Override
    public SearchArticleParams toSearchArticleParams(SearchArticleReq req) {
        if ( req == null ) {
            return null;
        }

        SearchArticleParams searchArticleParams = new SearchArticleParams();

        searchArticleParams.setPageNum( req.getPageNumber() );
        searchArticleParams.setPageSize( req.getPageSize() );

        return searchArticleParams;
    }
}
