package com.miniblog.service.article.conveter;


import com.miniblog.api.vo.article.response.ArticleColumnRelationResponseDTO;
import com.miniblog.service.article.repository.entity.ColumnArticleDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.factory.Mappers;

/**
 * 文章关联专栏转换器
 */
@Mapper(componentModel = "spring")
public interface ArticleColumnRelationConverter {
    // 获取文章关联专栏转换器实例
    ArticleColumnRelationConverter INSTANCE = Mappers.getMapper(ArticleColumnRelationConverter.class);

    // DO to DTO
    ArticleColumnRelationResponseDTO toResponseDto(ColumnArticleDO columnArticleDO);

    // DTO to DO
    @Mapping(target = "updateTime", expression = "java(new java.util.Date())")
    @Mapping(target = "id", constant = "0L")
    @Mapping(target = "createTime", expression = "java(new java.util.Date())")
    ColumnArticleDO toDo(ArticleColumnRelationResponseDTO articleColumnRelationResponseDTO);
}
