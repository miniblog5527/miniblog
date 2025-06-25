package com.miniblog.api.enums;

import lombok.Getter;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
public enum ArticleEventEnum {
    CREATE(1, "创建"),
    ONLINE(2, "发布"),
    REVIEW(3, "审核"),
    DELETE(4, "删除"),
    OFFLINE(5, "下线");

    private final int type;
    private final String msg;

    private static final Map<Integer, ArticleEventEnum> mapper = Stream.of(values())
            .collect(Collectors.toMap(e -> e.type, e -> e));

    ArticleEventEnum(int type, String msg) {
        this.type = type;
        this.msg = msg;
    }

    public static ArticleEventEnum typeOf(int type) {
        return mapper.get(type);
    }

    public static ArticleEventEnum typeOf(String type) {
        return type != null ? valueOf(type.toUpperCase().trim()) : null;
    }
}
