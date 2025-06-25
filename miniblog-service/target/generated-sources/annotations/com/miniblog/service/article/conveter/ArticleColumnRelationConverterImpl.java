package com.miniblog.service.article.conveter;

import com.miniblog.api.vo.article.response.ArticleColumnRelationResponseDTO;
import com.miniblog.service.article.repository.entity.ColumnArticleDO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-25T20:18:50+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.15 (Amazon.com Inc.)"
)
@Component
public class ArticleColumnRelationConverterImpl implements ArticleColumnRelationConverter {

    @Override
    public ArticleColumnRelationResponseDTO toResponseDto(ColumnArticleDO columnArticleDO) {
        if ( columnArticleDO == null ) {
            return null;
        }

        Long columnId = null;
        Long articleId = null;
        Integer section = null;
        Integer readType = null;

        ArticleColumnRelationResponseDTO articleColumnRelationResponseDTO = new ArticleColumnRelationResponseDTO( columnId, articleId, section, readType );

        return articleColumnRelationResponseDTO;
    }

    @Override
    public ColumnArticleDO toDo(ArticleColumnRelationResponseDTO articleColumnRelationResponseDTO) {
        if ( articleColumnRelationResponseDTO == null ) {
            return null;
        }

        ColumnArticleDO columnArticleDO = new ColumnArticleDO();

        columnArticleDO.setUpdateTime( new java.util.Date() );
        columnArticleDO.setId( (long) 0L );
        columnArticleDO.setCreateTime( new java.util.Date() );

        return columnArticleDO;
    }
}
