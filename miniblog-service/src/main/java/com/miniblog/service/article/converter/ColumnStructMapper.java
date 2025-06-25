package com.miniblog.service.article.converter;

import com.miniblog.api.model.vo.article.ColumnReq;
import com.miniblog.api.model.vo.article.dto.ColumnDTO;
import com.miniblog.service.article.repository.entity.column.ColumnInfoDO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import javax.annotation.processing.Generated;
import java.util.Date;
import java.util.List;

@Generated("org.mapstruct.ap.MappingProcessor")
@Mapper(componentModel = "spring")
public interface ColumnStructMapper {

    ColumnStructMapper INSTANCE = Mappers.getMapper( ColumnStructMapper.class);




    @Mapping(source = "id", target = "columnId")
    @Mapping(source = "columnName", target = "column")
    @Mapping(source = "articleNums", target = "nums")
    @Mapping(source = "publishTime", target = "publishTime", qualifiedByName = "dateToLong")
    @Mapping(source = "freeStartTime", target = "freeStartTime", qualifiedByName = "dateToLong")
    @Mapping(source = "freeEndTime", target = "freeEndTime", qualifiedByName = "dateToLong")
    ColumnDTO toDTO(ColumnInfoDO columnInfoDO);

    List<ColumnDTO> toDTOList(List<ColumnInfoDO> columnInfoDOList);

    @Mapping(source = "columnId", target = "id")
    @Mapping(source = "column", target = "columnName")
    @Mapping(source = "nums", target = "articleNums")
    @Mapping(source = "publishTime", target = "publishTime", qualifiedByName = "longToDate")
    @Mapping(source = "freeStartTime", target = "freeStartTime", qualifiedByName = "longToDate")
    @Mapping(source = "freeEndTime", target = "freeEndTime", qualifiedByName = "longToDate")
    ColumnInfoDO toEntity(ColumnDTO columnDTO);

    @Mapping(source = "columnId", target = "columnId")
    @Mapping(source = "columnName", target = "column")
    @Mapping(source = "articleNums", target = "nums")
    @Mapping(source = "freeStartTime", target = "freeStartTime", qualifiedByName = "dateToLong")
    @Mapping(source = "freeEndTime", target = "freeEndTime", qualifiedByName = "dateToLong")
    ColumnDTO reqToDTO(ColumnReq columnReq);

    @Mapping(source = "columnId", target = "columnId")
    @Mapping(source = "column", target = "columnName")
    @Mapping(source = "nums", target = "articleNums")
    @Mapping(source = "freeStartTime", target = "freeStartTime", qualifiedByName = "longToDate")
    @Mapping(source = "freeEndTime", target = "freeEndTime", qualifiedByName = "longToDate")
    ColumnReq dtoToReq(ColumnDTO columnDTO);

    @Mapping(source = "columnId", target = "id")
    @Mapping(source = "columnName", target = "columnName")
    @Mapping(source = "articleNums", target = "articleNums")
    ColumnInfoDO reqToEntity(ColumnReq columnReq);

    @Mapping(source = "id", target = "columnId")
    @Mapping(source = "columnName", target = "columnName")
    @Mapping(source = "articleNums", target = "articleNums")
    ColumnReq entityToReq(ColumnInfoDO columnInfoDO);

    @Named("dateToLong")
    default Long dateToLong(Date date) {
        return date != null ? date.getTime() : null;
    }

    @Named("longToDate")
    default Date longToDate(Long timestamp) {
        return timestamp != null ? new Date(timestamp) : null;
    }


}
