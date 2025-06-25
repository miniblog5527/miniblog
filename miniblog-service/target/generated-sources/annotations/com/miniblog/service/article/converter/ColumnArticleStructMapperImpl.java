package com.miniblog.service.article.converter;

import com.miniblog.api.model.vo.article.ColumnArticleReq;
import com.miniblog.api.model.vo.article.dto.ColumnArticleDTO;
import com.miniblog.service.article.repository.entity.column.ColumnArticleDO;
import java.sql.Timestamp;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-24T21:41:56+0800",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.13 (Amazon.com Inc.)"
)
@Component
public class ColumnArticleStructMapperImpl implements ColumnArticleStructMapper {

    @Override
    public ColumnArticleDTO toDTO(ColumnArticleDO columnArticleDO) {
        if ( columnArticleDO == null ) {
            return null;
        }

        ColumnArticleDTO columnArticleDTO = new ColumnArticleDTO();

        columnArticleDTO.setId( columnArticleDO.getId() );
        columnArticleDTO.setColumnId( columnArticleDO.getColumnId() );
        columnArticleDTO.setArticleId( columnArticleDO.getArticleId() );
        columnArticleDTO.setSort( columnArticleDO.getSection() );
        if ( columnArticleDO.getCreateTime() != null ) {
            columnArticleDTO.setCreateTime( new Timestamp( columnArticleDO.getCreateTime().getTime() ) );
        }

        return columnArticleDTO;
    }

    @Override
    public ColumnArticleDO toEntity(ColumnArticleDTO columnArticleDTO) {
        if ( columnArticleDTO == null ) {
            return null;
        }

        ColumnArticleDO columnArticleDO = new ColumnArticleDO();

        columnArticleDO.setId( columnArticleDTO.getId() );
        columnArticleDO.setColumnId( columnArticleDTO.getColumnId() );
        columnArticleDO.setArticleId( columnArticleDTO.getArticleId() );
        columnArticleDO.setSection( columnArticleDTO.getSort() );
        columnArticleDO.setCreateTime( columnArticleDTO.getCreateTime() );

        return columnArticleDO;
    }

    @Override
    public ColumnArticleDO reqToEntity(ColumnArticleReq columnArticleReq) {
        if ( columnArticleReq == null ) {
            return null;
        }

        ColumnArticleDO columnArticleDO = new ColumnArticleDO();

        columnArticleDO.setId( columnArticleReq.getId() );
        columnArticleDO.setColumnId( columnArticleReq.getColumnId() );
        columnArticleDO.setArticleId( columnArticleReq.getArticleId() );
        columnArticleDO.setSection( columnArticleReq.getSort() );

        return columnArticleDO;
    }

    @Override
    public ColumnArticleReq entityToReq(ColumnArticleDO columnArticleDO) {
        if ( columnArticleDO == null ) {
            return null;
        }

        ColumnArticleReq columnArticleReq = new ColumnArticleReq();

        columnArticleReq.setId( columnArticleDO.getId() );
        columnArticleReq.setColumnId( columnArticleDO.getColumnId() );
        columnArticleReq.setArticleId( columnArticleDO.getArticleId() );
        columnArticleReq.setSort( columnArticleDO.getSection() );
        columnArticleReq.setRead( columnArticleDO.getReadType() );

        return columnArticleReq;
    }

    @Override
    public ColumnArticleDTO reqToDTO(ColumnArticleReq columnArticleReq) {
        if ( columnArticleReq == null ) {
            return null;
        }

        ColumnArticleDTO columnArticleDTO = new ColumnArticleDTO();

        columnArticleDTO.setId( columnArticleReq.getId() );
        columnArticleDTO.setColumnId( columnArticleReq.getColumnId() );
        columnArticleDTO.setArticleId( columnArticleReq.getArticleId() );
        columnArticleDTO.setSort( columnArticleReq.getSort() );
        columnArticleDTO.setShortTitle( columnArticleReq.getShortTitle() );

        return columnArticleDTO;
    }

    @Override
    public ColumnArticleReq dtoToReq(ColumnArticleDTO columnArticleDTO) {
        if ( columnArticleDTO == null ) {
            return null;
        }

        ColumnArticleReq columnArticleReq = new ColumnArticleReq();

        columnArticleReq.setId( columnArticleDTO.getId() );
        columnArticleReq.setColumnId( columnArticleDTO.getColumnId() );
        columnArticleReq.setArticleId( columnArticleDTO.getArticleId() );
        columnArticleReq.setSort( columnArticleDTO.getSort() );
        columnArticleReq.setShortTitle( columnArticleDTO.getShortTitle() );

        return columnArticleReq;
    }
}
