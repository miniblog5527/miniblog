package com.miniblog.api.model.exception;


import com.miniblog.api.model.vo.constants.StatusEnum;

public class ExceptionUtil {

    public static ForumException of(StatusEnum status, Object... args) {
        return new ForumException(status, args);
    }

}
