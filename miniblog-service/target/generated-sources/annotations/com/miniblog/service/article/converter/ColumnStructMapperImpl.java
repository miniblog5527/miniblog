package com.miniblog.service.article.converter;

import com.miniblog.api.model.vo.article.ColumnReq;
import com.miniblog.api.model.vo.article.dto.ColumnDTO;
import com.miniblog.service.article.repository.entity.column.ColumnInfoDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-24T15:04:34+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.13 (Amazon.com Inc.)"
)
@Component
public class ColumnStructMapperImpl implements ColumnStructMapper {

    @Override
    public ColumnDTO toDTO(ColumnInfoDO columnInfoDO) {
        if ( columnInfoDO == null ) {
            return null;
        }

        ColumnDTO columnDTO = new ColumnDTO();

        columnDTO.setColumnId( columnInfoDO.getId() );
        columnDTO.setColumn( columnInfoDO.getColumnName() );
        columnDTO.setNums( columnInfoDO.getArticleNums() );
        columnDTO.setPublishTime( dateToLong( columnInfoDO.getPublishTime() ) );
        columnDTO.setFreeStartTime( dateToLong( columnInfoDO.getFreeStartTime() ) );
        columnDTO.setFreeEndTime( dateToLong( columnInfoDO.getFreeEndTime() ) );
        columnDTO.setIntroduction( columnInfoDO.getIntroduction() );
        columnDTO.setCover( columnInfoDO.getCover() );
        columnDTO.setSection( columnInfoDO.getSection() );
        columnDTO.setState( columnInfoDO.getState() );
        columnDTO.setType( columnInfoDO.getType() );
        columnDTO.setAuthor( columnInfoDO.getAuthor() );

        return columnDTO;
    }

    @Override
    public List<ColumnDTO> toDTOList(List<ColumnInfoDO> columnInfoDOList) {
        if ( columnInfoDOList == null ) {
            return null;
        }

        List<ColumnDTO> list = new ArrayList<ColumnDTO>( columnInfoDOList.size() );
        for ( ColumnInfoDO columnInfoDO : columnInfoDOList ) {
            list.add( toDTO( columnInfoDO ) );
        }

        return list;
    }

    @Override
    public ColumnInfoDO toEntity(ColumnDTO columnDTO) {
        if ( columnDTO == null ) {
            return null;
        }

        ColumnInfoDO columnInfoDO = new ColumnInfoDO();

        columnInfoDO.setId( columnDTO.getColumnId() );
        columnInfoDO.setColumnName( columnDTO.getColumn() );
        columnInfoDO.setArticleNums( columnDTO.getNums() );
        columnInfoDO.setPublishTime( longToDate( columnDTO.getPublishTime() ) );
        columnInfoDO.setFreeStartTime( longToDate( columnDTO.getFreeStartTime() ) );
        columnInfoDO.setFreeEndTime( longToDate( columnDTO.getFreeEndTime() ) );
        columnInfoDO.setAuthor( columnDTO.getAuthor() );
        columnInfoDO.setIntroduction( columnDTO.getIntroduction() );
        columnInfoDO.setCover( columnDTO.getCover() );
        columnInfoDO.setState( columnDTO.getState() );
        columnInfoDO.setSection( columnDTO.getSection() );
        columnInfoDO.setType( columnDTO.getType() );

        return columnInfoDO;
    }

    @Override
    public ColumnDTO reqToDTO(ColumnReq columnReq) {
        if ( columnReq == null ) {
            return null;
        }

        ColumnDTO columnDTO = new ColumnDTO();

        columnDTO.setColumnId( columnReq.getColumnId() );
        columnDTO.setColumn( columnReq.getColumnName() );
        columnDTO.setNums( columnReq.getArticleNums() );
        columnDTO.setFreeStartTime( dateToLong( columnReq.getFreeStartTime() ) );
        columnDTO.setFreeEndTime( dateToLong( columnReq.getFreeEndTime() ) );
        columnDTO.setIntroduction( columnReq.getIntroduction() );
        columnDTO.setCover( columnReq.getCover() );
        columnDTO.setSection( columnReq.getSection() );
        columnDTO.setType( columnReq.getType() );
        columnDTO.setAuthor( columnReq.getAuthor() );

        return columnDTO;
    }

    @Override
    public ColumnReq dtoToReq(ColumnDTO columnDTO) {
        if ( columnDTO == null ) {
            return null;
        }

        ColumnReq columnReq = new ColumnReq();

        columnReq.setColumnId( columnDTO.getColumnId() );
        columnReq.setColumnName( columnDTO.getColumn() );
        columnReq.setArticleNums( columnDTO.getNums() );
        columnReq.setFreeStartTime( longToDate( columnDTO.getFreeStartTime() ) );
        columnReq.setFreeEndTime( longToDate( columnDTO.getFreeEndTime() ) );
        columnReq.setAuthor( columnDTO.getAuthor() );
        columnReq.setCover( columnDTO.getCover() );
        columnReq.setIntroduction( columnDTO.getIntroduction() );
        columnReq.setSection( columnDTO.getSection() );
        columnReq.setType( columnDTO.getType() );

        return columnReq;
    }

    @Override
    public ColumnInfoDO reqToEntity(ColumnReq columnReq) {
        if ( columnReq == null ) {
            return null;
        }

        ColumnInfoDO columnInfoDO = new ColumnInfoDO();

        columnInfoDO.setId( columnReq.getColumnId() );
        columnInfoDO.setColumnName( columnReq.getColumnName() );
        columnInfoDO.setArticleNums( columnReq.getArticleNums() );
        columnInfoDO.setAuthor( columnReq.getAuthor() );
        columnInfoDO.setIntroduction( columnReq.getIntroduction() );
        columnInfoDO.setCover( columnReq.getCover() );
        columnInfoDO.setSection( columnReq.getSection() );
        columnInfoDO.setType( columnReq.getType() );
        columnInfoDO.setFreeStartTime( columnReq.getFreeStartTime() );
        columnInfoDO.setFreeEndTime( columnReq.getFreeEndTime() );

        return columnInfoDO;
    }

    @Override
    public ColumnReq entityToReq(ColumnInfoDO columnInfoDO) {
        if ( columnInfoDO == null ) {
            return null;
        }

        ColumnReq columnReq = new ColumnReq();

        columnReq.setColumnId( columnInfoDO.getId() );
        columnReq.setColumnName( columnInfoDO.getColumnName() );
        columnReq.setArticleNums( columnInfoDO.getArticleNums() );
        columnReq.setAuthor( columnInfoDO.getAuthor() );
        columnReq.setCover( columnInfoDO.getCover() );
        columnReq.setIntroduction( columnInfoDO.getIntroduction() );
        columnReq.setSection( columnInfoDO.getSection() );
        columnReq.setType( columnInfoDO.getType() );
        columnReq.setFreeStartTime( columnInfoDO.getFreeStartTime() );
        columnReq.setFreeEndTime( columnInfoDO.getFreeEndTime() );

        return columnReq;
    }
}
