package com.miniblog.service.article.conveter;

import com.miniblog.api.vo.article.SearchCategoryReq;
import com.miniblog.service.article.repository.params.SearchCategoryParams;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-25T20:18:50+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.15 (Amazon.com Inc.)"
)
public class CategoryStructMapperImpl implements CategoryStructMapper {

    @Override
    public SearchCategoryParams toSearchParams(SearchCategoryReq req) {
        if ( req == null ) {
            return null;
        }

        SearchCategoryParams searchCategoryParams = new SearchCategoryParams();

        if ( req.getPageNumber() != null ) {
            searchCategoryParams.setPageNum( req.getPageNumber() );
        }
        if ( req.getPageSize() != null ) {
            searchCategoryParams.setPageSize( req.getPageSize() );
        }

        return searchCategoryParams;
    }
}
