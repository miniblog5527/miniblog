package com.miniblog.service.article.service.impl;

import com.miniblog.api.model.vo.PageListVo;
import com.miniblog.api.model.vo.PageParam;
import com.miniblog.api.model.vo.article.ColumnReq;
import com.miniblog.api.model.vo.article.dto.ColumnDTO;
import com.miniblog.core.util.NumUtil;
import com.miniblog.service.article.converter.ColumnStructMapper;
import com.miniblog.service.article.repository.dao.column.ColumnArticleDao;
import com.miniblog.service.article.repository.dao.column.ColumnDao;
import com.miniblog.service.article.repository.entity.column.ColumnInfoDO;
import com.miniblog.service.article.service.ColumnSettingService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ColumnSettingServiceImpl implements ColumnSettingService {


    private static final Logger logger = log;


    @Autowired
    private ColumnDao columnDao;

    @Autowired
    private ColumnArticleDao columnArticleDao;

    @Autowired
    private ColumnStructMapper columnStructMapper;

    @Override
    public void saveColumn(ColumnReq req) {
        ColumnInfoDO columnInfoDO =columnStructMapper.reqToEntity(req);

        columnDao.saveOrUpdate(columnInfoDO);

    }

    @Override
    public void deleteColumn(ColumnReq req) {
        ColumnInfoDO columnInfoDO =columnStructMapper.reqToEntity(req);
        if (isColumnInfoDOEmpty(columnInfoDO)) {
            return;
        }
        columnDao.removeById(columnInfoDO.getId());

    }




    private boolean isColumnInfoDOEmpty(ColumnInfoDO columnInfoDO) {
        return columnInfoDO.getColumnName() == null && columnInfoDO.getAuthor() == null && columnInfoDO.getIntroduction() == null && columnInfoDO.getCover() == null && columnInfoDO.getSection() == null && columnInfoDO.getArticleNums() == null && columnInfoDO.getType() == null && columnInfoDO.getFreeStartTime() == null && columnInfoDO.getFreeEndTime() == null;
    }
}
