package com.miniblog.service.article.conveter;

import com.miniblog.api.vo.article.ColumnArticleReq;
import com.miniblog.api.vo.article.ColumnReq;
import com.miniblog.api.vo.article.dto.ColumnDTO;
import com.miniblog.service.article.repository.entity.ColumnArticleDO;
import com.miniblog.service.article.repository.entity.ColumnInfoDO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ColumnConvert {

    // 将ColumnInfoDO转换为ColumnDTO
    public static ColumnDTO toDto(ColumnInfoDO info) {
        ColumnDTO dto = new ColumnDTO();
        // 设置列ID
        dto.setColumnId(info.getId());
        // 设置列名
        dto.setColumn(info.getColumnName());
        // 设置封面
        dto.setCover(info.getCover());
        // 设置介绍
        dto.setIntroduction(info.getIntroduction());
        // 设置状态
        dto.setState(info.getState());
        // 设置数量
        dto.setNums(info.getNums());
        // 设置作者
        dto.setAuthor(info.getUserId());
        // 设置章节
        dto.setSection(info.getSection());
        // 设置发布时间
        dto.setPublishTime(info.getPublishTime().getTime());
        // 设置类型
        dto.setType(info.getType());
        // 设置免费开始时间
        dto.setFreeStartTime(info.getFreeStartTime().getTime());
        // 设置免费结束时间
        dto.setFreeEndTime(info.getFreeEndTime().getTime());
        return dto;
    }

    // 将List<ColumnInfoDO>转换为List<ColumnDTO>
    public static List<ColumnDTO> toDtos(List<ColumnInfoDO> columnInfoDOS) {
        List<ColumnDTO> columnDTOS = new ArrayList<>();
        // 遍历columnInfoDOS，将每个ColumnInfoDO转换为ColumnDTO，并添加到columnDTOS中
        columnInfoDOS.forEach(info -> columnDTOS.add(ColumnConvert.toDto(info)));
        return columnDTOS;
    }

    // 将ColumnReq转换为ColumnInfoDO
    public static ColumnInfoDO toDo(ColumnReq columnReq) {
        if (columnReq == null) {
            return null;
        }
        ColumnInfoDO columnInfoDO = new ColumnInfoDO();
        // 设置列名
        columnInfoDO.setColumnName(columnReq.getColumn());
        // 设置作者
        columnInfoDO.setUserId(columnReq.getAuthor());
        // 设置介绍
        columnInfoDO.setIntroduction(columnReq.getIntroduction());
        // 设置封面
        columnInfoDO.setCover(columnReq.getCover());
        // 设置状态
        columnInfoDO.setState(columnReq.getState());
        // 设置章节
        columnInfoDO.setSection(columnReq.getSection());
        // 设置数量
        columnInfoDO.setNums(columnReq.getNums());
        // 设置类型
        columnInfoDO.setType(columnReq.getType());
        // 设置免费开始时间
        columnInfoDO.setFreeStartTime(new Date(columnReq.getFreeStartTime()));
        // 设置免费结束时间
        columnInfoDO.setFreeEndTime(new Date(columnReq.getFreeEndTime()));
        return columnInfoDO;
    }

    // 将ColumnArticleReq转换为ColumnArticleDO
    public static ColumnArticleDO toDo(ColumnArticleReq columnArticleReq) {
        if (columnArticleReq == null) {
            return null;
        }
        ColumnArticleDO columnArticleDO = new ColumnArticleDO();
        // 设置列ID
        columnArticleDO.setColumnId(columnArticleReq.getColumnId());
        // 设置文章ID
        columnArticleDO.setArticleId(columnArticleReq.getArticleId());
        // 设置排序
        columnArticleDO.setSection(columnArticleReq.getSort());
        return columnArticleDO;
    }

}
