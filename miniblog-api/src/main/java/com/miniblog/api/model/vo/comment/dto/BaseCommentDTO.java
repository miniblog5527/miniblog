package com.miniblog.api.model.vo.comment.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class BaseCommentDTO implements Comparable<BaseCommentDTO> {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户图像
     */
    private String userPhoto;

    /**
     * 评论时间
     */
    private Long commentTime;

    /**
     * 评论内容
     */
    private String commentContent;

    /**
     * 评论id
     */
    private Long commentId;

    /**
     * 点赞数量
     */
    private Integer praiseCount;

    /**
     * true 表示已经点赞
     */
    private Boolean praised;

    @Override
    public int compareTo(@NotNull BaseCommentDTO o) {
        return Long.compare(o.getCommentTime(), this.commentTime);
    }
}