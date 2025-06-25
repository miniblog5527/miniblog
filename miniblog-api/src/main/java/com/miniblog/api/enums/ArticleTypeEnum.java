package com.miniblog.api.enums;

import lombok.Getter;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 文章类型枚举
 * 用于标识不同类型的文章，并提供类型代码与枚举值的快速映射
 */
@Getter
public enum ArticleTypeEnum {

    EMPTY(0, ""),             // 空类型（默认值）
    BLOG(1, "博文"),          // 博客文章
    ANSWER(2, "问答"),        // 问答内容
    COLUMN(3, "专栏文章");    // 专栏文章

    /**
     * 类型代码（与数据库存储值对应）
     */
    private final Integer code;

    /**
     * 类型描述（用于前端展示）
     */
    private final String desc;

    /**
     * 静态映射表：代码 → 枚举实例
     * 用于通过代码快速定位枚举值（时间复杂度 O(1)）
     */
    private static final Map<Integer, ArticleTypeEnum> codeMap = Stream.of(values())
            .collect(Collectors.toMap(ArticleTypeEnum::getCode, e -> e));

    /**
     * 私有构造函数，初始化枚举值
     *
     * @param code 类型代码
     * @param desc 类型描述
     */
    ArticleTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * 通过类型代码获取对应的枚举值
     *
     * @param code 类型代码（允许为 null）
     * @return 对应的枚举值，若未找到则返回 EMPTY
     */
    public static ArticleTypeEnum fromCode(Integer code) {
        // 处理 null 输入，避免空指针异常
        if (code == null) {
            return EMPTY;
        }
        // 从映射表中获取枚举值，未找到时返回默认的 EMPTY
        return codeMap.getOrDefault(code, EMPTY);
    }
}
