package com.miniblog.api.model.vo.user.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serial;
import java.io.Serializable;

/**
 * 基本用户信息
 */

@Data
@Accessors(chain = true)
public class SimpleUserInfoDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 4802653694786272120L;

    @Schema(description = "作者ID")
    private Long userId;

    @Schema(description = "作者名")
    private String name;

    @Schema(description = "作者头像")
    private String avatar;

    @Schema(description = "作者简介")
    private String profile;
}
