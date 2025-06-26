package com.miniblog.api.model.exception;

import com.miniblog.api.model.vo.Status;
import com.miniblog.api.model.vo.constants.StatusEnum;
import lombok.Getter;

/**
 * 业务异常
 * 封装业务操作中出现的异常情况，包含错误状态信息
 */
public class ForumException extends RuntimeException {
    @Getter
    private Status status;

    // 基础构造函数
    public ForumException(Status status) {
        super(status.getMsg()); // 确保父类 message 被设置
        this.status = status;
    }

    // 带原始异常的构造函数
    public ForumException(Status status, Throwable cause) {
        super(status.getMsg(), cause); // 传递原始异常
        this.status = status;
    }

    // 通过错误码和消息创建
    public ForumException(int code, String msg) {
        this(Status.newStatus(code, msg));
    }

    // 通过错误码、消息和原始异常创建
    public ForumException(int code, String msg, Throwable cause) {
        this(Status.newStatus(code, msg), cause);
    }

    // 通过枚举和参数创建
    public ForumException(StatusEnum statusEnum, Object... args) {
        this(Status.newStatus(statusEnum, args));
    }

    // 通过枚举、参数和原始异常创建
    public ForumException(StatusEnum statusEnum, Throwable cause, Object... args) {
        this(Status.newStatus(statusEnum, args), cause);
    }
}
