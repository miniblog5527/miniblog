package com.miniblog.service.article.service;

import com.miniblog.api.model.vo.PageListVo;
import com.miniblog.api.model.vo.PageParam;
import com.miniblog.api.model.vo.article.dto.ColumnDTO;

public interface ColumnInfoService {
   public PageListVo<ColumnDTO> queryListColumn(String columnName, PageParam pageParam);
}
