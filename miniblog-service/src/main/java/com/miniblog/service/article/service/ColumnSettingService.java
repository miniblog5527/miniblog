package com.miniblog.service.article.service;

import com.miniblog.api.model.vo.PageListVo;
import com.miniblog.api.model.vo.article.ColumnReq;
import com.miniblog.api.model.vo.article.dto.ColumnDTO;

public interface ColumnSettingService {


    void saveColumn(ColumnReq req);


    void deleteColumn(ColumnReq req);


}
