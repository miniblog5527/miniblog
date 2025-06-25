package com.miniblog.api.model.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Data
@Schema (title = "基础DTO")
public class BaseDTO {

    @Schema(title = "id")
    private Long id;

    @Schema(title = "创建时间")
    private Date createTime;

    @Schema(title = "更新时间")
    private Date updateTime;
}
