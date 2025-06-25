package com.miniblog.service.article.repository.dao.column;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Repository;
import com.miniblog.service.article.repository.entity.column.ColumnArticleDO;
import com.miniblog.service.article.repository.mapper.column.ColumnArticleMapper;

@Repository
public class ColumnArticleDao extends ServiceImpl<ColumnArticleMapper, ColumnArticleDO> {

    public Integer selectMaxSection(Long columnId) {
        // 构建查询条件：查找指定专栏下的最大 section 值
        LambdaQueryWrapper<ColumnArticleDO> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.select(ColumnArticleDO::getSection)
                .eq(ColumnArticleDO::getColumnId, columnId)
                .orderByDesc(ColumnArticleDO::getSection)
                .last("LIMIT 1");

        // 执行查询并获取结果
        ColumnArticleDO record = this.getOne(queryWrapper);

        // 如果查询结果不为空，返回 section 值，否则返回 null
        return record != null ? record.getSection() : null;
    }

    public void removeArticle(Long columnId, Long articleId) {
        LambdaQueryWrapper<ColumnArticleDO> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(ColumnArticleDO::getColumnId, columnId);
        queryWrapper.eq(ColumnArticleDO::getArticleId, articleId);

        this.remove(queryWrapper);
    }
}
