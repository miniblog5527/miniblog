package com.miniblog.service.article.repository.dao.column;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.miniblog.service.article.repository.entity.column.ColumnInfoDO;
import com.miniblog.service.article.repository.mapper.column.ColumnInfoMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ColumnDao extends ServiceImpl<ColumnInfoMapper, ColumnInfoDO> {
    // 如果有其他特定于ColumnDao的方法可以在这里添加

    public Page<ColumnInfoDO> selectColumnPage(Page<ColumnInfoDO> page, QueryWrapper<ColumnInfoDO> queryWrapper) {
        return baseMapper.selectPage(page, queryWrapper);
    }


}
