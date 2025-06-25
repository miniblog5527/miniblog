package com.miniblog.api.model.vo.article;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

@Data
@Schema(name = "专栏信息请求体")
public class ColumnReq  implements Serializable {

    @Schema(description = "专栏编号")
    private Long columnId;
    @Schema(description = "专栏名称")
    private String columnName;
    @Schema(description = "作者")
    private Long author;
    @Schema(description = "专栏封面")
    private String cover;
    @Schema(description = "专栏简介")
    private String introduction;
    @Schema(description = "专栏排序")
    private Integer section;
    @Schema(description = "专栏类型")
    private Integer articleNums ;


    @Schema(description = "专栏类型 0-免费 1-登录 2-限免 3-绑定星球")
    private Integer type;

    @Schema(description = "免费开始时间")
    private Date freeStartTime;
    @Schema(description = "免费结束时间")
    private Date freeEndTime;
}
