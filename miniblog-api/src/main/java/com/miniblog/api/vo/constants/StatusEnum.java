package com.miniblog.api.vo.constants;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum StatusEnum {
    // 成功状态
    SUCCESS(0, "OK"),

    // 全局错误
    ILLEGAL_ARGUMENTS(100_400_001, "参数异常"),
    ILLEGAL_ARGUMENTS_MIXED(100_400_002, "参数异常:%s"),
    FORBID_ERROR(100_403_001, "无权限"),
    FORBID_ERROR_MIXED(100_403_002, "无权限:%s"),
    FORBID_NOTLOGIN(100_403_003, "未登录"),
    RECORDS_NOT_EXISTS(100_404_001, "记录不存在:%s"),
    UNEXPECT_ERROR(100_500_001, "非预期异常:%s"),
    UPLOAD_PIC_FAILED(100_500_002, "图片上传失败"),

    // 文章相关错误
    ARTICLE_NOT_EXISTS(200_404_001, "文章不存在:%s"),
    COLUMN_NOT_EXISTS(200_404_002, "教程不存在:%s"),
    COLUMN_QUERY_ERROR(200_500_003, "教程查询异常:%s"),
    COLUMN_ARTICLE_EXISTS(200_500_004, "专栏教程已存在:%s"),
    ARTICLE_RELATION_TUTORIAL(200_500_006, "文章已被添加为教程:%s"),
    CATEGORY_NOT_EXISTS(200_404_101, "分类不存在:%s"),

    // 评论相关错误
    COMMENT_NOT_EXISTS(300_404_001, "评论不存在:%s"),

    // 用户相关错误
    LOGIN_FAILED_MIXED(400_403_001, "登录失败:%s"),
    USER_NOT_EXISTS(400_404_001, "用户不存在:%s"),
    USER_EXISTS(400_404_002, "用户已存在:%s"),
    USER_LOGIN_NAME_REPEAT(400_404_003, "用户登录名重复:%s"),
    USER_NOT_AUDIT(400_500_001, "用户未审核:%s"),
    USER_STAR_NOT_EXISTS(400_404_002, "星球编号不存在:%s"),
    USER_STAR_REPEAT(400_404_002, "星球编号重复:%s"),
    USER_PWD_ERROR(400_500_002, "用户名or密码错误"),
    NO_PERMISSION(400_403_002, "权限不足");

    private final int code;
    private final String msg;

    // 静态映射表：加速错误码查找
    private static final Map<Integer, StatusEnum> codeMap = new HashMap<>();

    static {
        // 初始化映射表
        for (StatusEnum status : values()) {
            codeMap.put(status.code, status);
        }
    }

    StatusEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    // 业务模块分类方法
    public boolean isGlobalError() {
        return code / 1000_000 == 100;
    }

    public boolean isArticleError() {
        return code / 1000_000 == 200;
    }

    public boolean isCommentError() {
        return code / 1000_000 == 300;
    }

    public boolean isUserError() {
        return code / 1000_000 == 400;
    }

    // 状态类型判断方法
    public static boolean isSuccess(int code) {
        return code == 0;
    }

    public static boolean is5xx(int code) {
        return code % 1000_000 / 1000 >= 500;
    }

    public static boolean is403(int code) {
        return code % 1000_000 / 1000 == 403;
    }

    public static boolean is4xx(int code) {
        return code % 1000_000 / 1000 < 500 && code % 1000_000 / 1000 >= 400;
    }

    // 根据错误码查找枚举值
    public static StatusEnum of(int code) {
        return codeMap.getOrDefault(code, null);
    }
}
