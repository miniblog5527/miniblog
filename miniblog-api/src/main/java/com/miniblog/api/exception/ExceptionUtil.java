package com.miniblog.api.exception;

import com.miniblog.api.vo.constants.StatusEnum;

public class ExceptionUtil {

    public static ForumException of(StatusEnum status, Object... args) {
        return new ForumException(status, args);
    }

}
