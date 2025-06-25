package com.miniblog.service.article.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.miniblog.api.model.vo.PageListVo;
import com.miniblog.api.model.vo.PageParam;
import com.miniblog.api.model.vo.article.dto.ColumnDTO;
import com.miniblog.service.article.converter.ColumnStructMapper;
import com.miniblog.service.article.repository.dao.column.ColumnDao;
import com.miniblog.service.article.repository.entity.column.ColumnInfoDO;
import com.miniblog.service.article.service.ColumnInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColumnInfoServiceImpl implements ColumnInfoService {

    @Autowired
    private ColumnDao columnDao;

    @Autowired
    private ColumnStructMapper columnStructMapper;






    @Override
    public PageListVo<ColumnDTO> queryListColumn(String columnName, PageParam pageParam) {
        // 1. 构建查询条件
        QueryWrapper<ColumnInfoDO> queryWrapper = new QueryWrapper<>();
        if (columnName != null && !columnName.isEmpty()) {
            queryWrapper.like("column_name", columnName);
        }

        // 2. 执行分页查询
        Page<ColumnInfoDO> pageResult = columnDao.selectColumnPage(
                new Page<>(pageParam.getPageNum(), pageParam.getPageSize()),
                queryWrapper
        );

        // 3. 转换DO到DTO
        List<ColumnDTO> columnDTOs = columnStructMapper.toDTOList(pageResult.getRecords());

        // 4. 构建分页结果
        PageListVo<ColumnDTO> result = new PageListVo<>();
        result.setList(columnDTOs);
        result.setPageNum((int) pageResult.getCurrent());
        result.setPageSize((int) pageResult.getSize());
        result.setTotal(pageResult.getTotal());
        result.setPages((int) pageResult.getPages());

        return result;
    }
}
