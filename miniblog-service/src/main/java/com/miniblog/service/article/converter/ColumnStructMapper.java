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





    ColumnDTO toDTO(ColumnInfoDO columnInfoDO);

    List<ColumnDTO> toDTOList(List<ColumnInfoDO> columnInfoDOList);


    ColumnInfoDO toEntity(ColumnDTO columnDTO);



    @Mapping(target = "freeStartTime", source = "freeStartTime", qualifiedByName = "dateToLong")
    @Mapping(target = "freeEndTime", source = "freeEndTime", qualifiedByName = "dateToLong")
    ColumnDTO reqToDTO(ColumnReq columnReq);


    @Mapping(target = "freeStartTime", source = "freeStartTime", qualifiedByName = "longToDate")
    @Mapping(target = "freeEndTime", source = "freeEndTime", qualifiedByName = "longToDate")
    ColumnReq dtoToReq(ColumnDTO columnDTO);


    ColumnInfoDO reqToEntity(ColumnReq columnReq);


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
