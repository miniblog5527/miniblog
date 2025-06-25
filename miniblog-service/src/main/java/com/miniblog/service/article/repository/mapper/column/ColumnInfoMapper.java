package com.miniblog.service.article.repository.mapper.column;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.miniblog.service.article.repository.entity.column.ColumnInfoDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ColumnInfoMapper extends BaseMapper<ColumnInfoDO> {

    ColumnInfoDO queryColumnInfoByColumnName(String columnName);
}
