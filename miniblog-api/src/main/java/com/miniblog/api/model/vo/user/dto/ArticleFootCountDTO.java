package com.miniblog.api.model.vo.user.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 文章互动数据统计DTO
 * 包含点赞、阅读、收藏、评论等计数
 */
@Data
public class ArticleFootCountDTO implements Serializable {

    /**
     * 文章点赞数
     */
    private Integer praiseCnt;

    /**
     * 文章阅读数
     */
    private Integer readCnt;

    /**
     * 文章收藏数
     */
    private Integer collectCnt;

    /**
     * 评论数
     */
    private Integer commentCnt;

    /**
     * 构造函数：初始化所有计数为0
     */
    public ArticleFootCountDTO() {
        this.praiseCnt = 0;
        this.readCnt = 0;
        this.collectCnt = 0;
        this.commentCnt = 0;
    }

    /**
     * 批量更新计数
     */
    public void updateCounts(Integer praise, Integer read,
                             Integer collect, Integer comment) {
        this.praiseCnt = praise == null ? this.praiseCnt : praise;
        this.readCnt = read == null ? this.readCnt : read;
        this.collectCnt = collect == null ? this.collectCnt : collect;
        this.commentCnt = comment == null ? this.commentCnt : comment;
    }

    /**
     * 原子性增加点赞数
     */
    public void incrementPraise() {
        this.praiseCnt++;
    }

    // 其他计数的原子更新方法（同理）
    public void incrementRead() {
        this.readCnt++;
    }

    public void incrementCollect() {
        this.collectCnt++;
    }

    public void incrementComment() {
        this.commentCnt++;
    }
}
