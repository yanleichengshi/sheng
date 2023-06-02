package com.tan.orders.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCode {
    SUCCESS(10020, "成功"),

    FAILED(10040, "失败")
    ;

    private final Integer code;

    private final String msg;
}
