package com.tan.orders.config;

import lombok.Data;

/**
 * 统一相应
 */
@Data
public class R<T> {
    private Integer code;

    private String msg;

    private T data;

    /**
     * success
     */
    public static R<Void> success() {
        R<Void> result = new R<>();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMsg(ResultCode.SUCCESS.getMsg());
        return result;
    }

    /**
     * success with data
     */
    public static <T> R<T> success(T data) {
        R<T> result = new R<>();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMsg(ResultCode.SUCCESS.getMsg());
        result.setData(data);
        return result;
    }

    /**
     * fail
     */
    public static R<Void> fail() {
        R<Void> result = new R<>();
        result.setCode(ResultCode.FAILED.getCode());
        result.setMsg(ResultCode.FAILED.getMsg());
        return result;
    }

    /**
     * 失败，自定义消息
     */
    public static R<Void> fail(String msg) {
        R<Void> result = new R<>();
        result.setCode(ResultCode.FAILED.getCode());
        result.setMsg(msg);
        return result;
    }

    /**
     * 失败，使用已定义枚举
     */
    public static R<Void> fail(ResultCode resultCode) {
        R<Void> result = new R<>();
        result.setCode(resultCode.getCode());
        result.setMsg(resultCode.getMsg());
        return result;
    }
}
