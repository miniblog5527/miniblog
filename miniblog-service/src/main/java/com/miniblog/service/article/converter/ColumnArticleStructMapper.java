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
    ColumnArticleDTO toDTO(ColumnArticleDO columnArticleDO);

    // DTO -> DO 转换

    ColumnArticleDO toEntity(ColumnArticleDTO columnArticleDTO);

    // Req -> DO 转换

    ColumnArticleDO reqToEntity(ColumnArticleReq columnArticleReq);

    // DO -> Req 转换

    ColumnArticleReq entityToReq(ColumnArticleDO columnArticleDO);

    // Req -> DTO 转换

    ColumnArticleDTO reqToDTO(ColumnArticleReq columnArticleReq);

    // DTO -> Req 转换

    ColumnArticleReq dtoToReq(ColumnArticleDTO columnArticleDTO);
}
