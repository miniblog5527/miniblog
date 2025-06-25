package com.miniblog.service.article.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.miniblog.api.model.vo.article.ColumnArticleReq;
import com.miniblog.api.model.vo.article.ColumnReq;
import com.miniblog.service.article.converter.ColumnArticleStructMapper;
import com.miniblog.service.article.converter.ColumnStructMapper;
import com.miniblog.service.article.repository.dao.column.ColumnArticleDao;
import com.miniblog.service.article.repository.entity.column.ColumnArticleDO;
import com.miniblog.service.article.repository.entity.column.ColumnInfoDO;
import com.miniblog.service.article.service.ColumnArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
public class ColumnArticleServiceImpl implements ColumnArticleService {
    @Autowired
    private ColumnStructMapper columnStructMapper;
    @Autowired
    private ColumnArticleStructMapper columnArticleStructMapper;
    @Autowired
    private ColumnArticleDao columnArticleDao;


    @Transactional
    public void addColumnArticle(Long articleId, Long columnId) {
        // 查询文章是否已关联到专栏
        ColumnArticleDO exist = columnArticleDao.getOne(
                Wrappers.<ColumnArticleDO>lambdaQuery()
                        .eq(ColumnArticleDO::getArticleId, articleId)
        );

        if (exist != null) {
            // 文章已存在，检查是否需要更新专栏
            if (!Objects.equals(columnId, exist.getColumnId())) {
                exist.setColumnId(columnId);
                // 重新计算章节序号
                Integer maxSection = columnArticleDao.selectMaxSection(columnId);
                exist.setSection(maxSection != null ? maxSection + 1 : 1);
                columnArticleDao.updateById(exist);
            }
        } else {
            // 文章不存在，创建新关联
            ColumnArticleDO columnArticleDO = new ColumnArticleDO();
            columnArticleDO.setColumnId(columnId);
            columnArticleDO.setArticleId(articleId);

            // 获取当前专栏的最大章节序号
            Integer maxSection = columnArticleDao.selectMaxSection(columnId);
            // 如果没有记录，从1开始
            columnArticleDO.setSection(maxSection != null ? maxSection + 1 : 1);

            columnArticleDao.save(columnArticleDO);
        }
    }

    @Override
    public void deleteColumnArticle(Long columnId, Long articleId) {

        columnArticleDao.removeArticle(columnId,articleId);
    }
}
