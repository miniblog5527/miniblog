package com.miniblog.api.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


import java.util.Date;

@Data
public class BaseDTO {

    @Schema(title = "业务主键")
    private Long id;
    @Schema(title = "创建时间")
    private Date createTime;
    @Schema(title = "更新时间")
    private Date updateTime;


}
