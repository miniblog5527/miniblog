package com.miniblog.api.vo.article.dto;
// todo

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 标签DTO
 */
@Data
public class TagDTO implements Serializable {
    // 序列化版本号
    private static final long serialVersionUID = -8614833588325787479L;

    // 标签ID
    private Long tagId;

    // 标签名称
    private String tag;

    // 标签状态
    private Integer status;

    // 是否选中
    private Boolean selected;
}