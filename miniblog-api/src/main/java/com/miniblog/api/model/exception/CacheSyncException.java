package com.miniblog.api.model.exception;

public class CacheSyncException extends RuntimeException {
    /**
     * 错误码枚举
     */
    public enum ErrorCode {
        NO_CACHE_TYPE_ANNOTATION("CACHE-001", "没有对应的缓存类型注解");

        private final String code;
        private final String message;

        ErrorCode(String code, String message) {
            this.code = code;
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }

    private final String errorCode;

    public CacheSyncException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode.getCode();
    }

    public CacheSyncException(ErrorCode errorCode, Throwable cause) {
        super(errorCode.getMessage(), cause);
        this.errorCode = errorCode.getCode();
    }

    public String getErrorCode() {
        return errorCode;
    }
}
