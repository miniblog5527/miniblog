package com.miniblog.service.article.converter;


import com.miniblog.api.model.vo.article.ColumnArticleReq;
import com.miniblog.api.model.vo.article.dto.ColumnArticleDTO;
import com.miniblog.service.article.repository.entity.column.ColumnArticleDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ColumnArticleStructMapper {

    ColumnArticleStructMapper INSTANCE = Mappers.getMapper(ColumnArticleStructMapper.class);

    // DO -> DTO 转换
    @Mapping(source = "id", target = "id")
    @Mapping(source = "columnId", target = "columnId")
    @Mapping(source = "articleId", target = "articleId")
    @Mapping(source = "section", target = "sort")
    ColumnArticleDTO toDTO(ColumnArticleDO columnArticleDO);

    // DTO -> DO 转换
    @Mapping(source = "id", target = "id")
    @Mapping(source = "columnId", target = "columnId")
    @Mapping(source = "articleId", target = "articleId")
    @Mapping(source = "sort", target = "section")

    ColumnArticleDO toEntity(ColumnArticleDTO columnArticleDTO);

    // Req -> DO 转换
    @Mapping(source = "id", target = "id")
    @Mapping(source = "columnId", target = "columnId")
    @Mapping(source = "articleId", target = "articleId")
    @Mapping(source = "sort", target = "section")
    ColumnArticleDO reqToEntity(ColumnArticleReq columnArticleReq);

    // DO -> Req 转换
    @Mapping(source = "id", target = "id")
    @Mapping(source = "columnId", target = "columnId")
    @Mapping(source = "articleId", target = "articleId")
    @Mapping(source = "section", target = "sort")
    @Mapping(source = "readType", target = "read")
    ColumnArticleReq entityToReq(ColumnArticleDO columnArticleDO);

    // Req -> DTO 转换
    @Mapping(source = "id", target = "id")
    @Mapping(source = "columnId", target = "columnId")
    @Mapping(source = "articleId", target = "articleId")
    @Mapping(source = "sort", target = "sort")
    ColumnArticleDTO reqToDTO(ColumnArticleReq columnArticleReq);

    // DTO -> Req 转换
    @Mapping(source = "id", target = "id")
    @Mapping(source = "columnId", target = "columnId")
    @Mapping(source = "articleId", target = "articleId")
    @Mapping(source = "sort", target = "sort")
    ColumnArticleReq dtoToReq(ColumnArticleDTO columnArticleDTO);
}
