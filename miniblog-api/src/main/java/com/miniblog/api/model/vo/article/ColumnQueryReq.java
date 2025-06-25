package com.miniblog.api.model.vo.article;

import lombok.Data;

@Data
public class ColumnQueryReq {
    private String column;
    private Integer pageNumber;
    private Integer pageSize;
}
