package com.miniblog.api.model.vo;

import com.miniblog.api.model.vo.constants.StatusEnum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 业务状态信息
 * 封装操作结果的状态码和描述信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Status {

    /**
     * 成功状态
     */
    public static final Status SUCCESS = new Status(0, "ok");

    /**
     * 业务状态码
     */
    @Schema(description = "状态码, 0表示成功返回，其他异常返回", required = true, example = "0")
    private int code;

    /**
     * 描述信息
     */
    @Schema(description = "正确返回时为ok，异常时为描述文案", required = true, example = "ok")
    private String msg;

    /**
     * 创建状态对象
     */
    public static Status newStatus(int code, String msg) {
        return new Status(code, msg);
    }

    /**
     * 通过枚举和参数创建状态对象
     */
    public static Status newStatus(StatusEnum status, Object... msgs) {
        String formattedMsg = formatMessage(status.getMsg(), msgs);
        return newStatus(status.getCode(), formattedMsg);
    }

    /**
     * 安全的消息格式化（避免参数不匹配异常）
     */
    private static String formatMessage(String template, Object... args) {
        if (template == null || args == null || args.length == 0) {
            return template;
        }
        try {
            return String.format(template, args);
        } catch (Exception e) {
            // 格式化失败时返回原始模板 + 参数信息
            return template + " (参数: " + String.join(", ", java.util.Arrays.stream(args)
                    .map(arg -> arg != null ? arg.toString() : "null")
                    .toArray(String[]::new)) + ")";
        }
    }

    /**
     * 链式设置状态码
     */
    public Status withCode(int code) {
        this.code = code;
        return this;
    }

    /**
     * 链式设置消息
     */
    public Status withMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
