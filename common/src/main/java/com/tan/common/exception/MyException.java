package com.tan.common.exception;

import com.tan.common.resp.ErrorEnum;
import com.tan.common.resp.ResultCode;
import lombok.Getter;

/**
 * 自定义异常
 */
@Getter
public class MyException extends RuntimeException {
    private int errorCode;

    private String message;

    public MyException(String msg) {
        this.errorCode = ResultCode.FAILED.getCode();
        this.message = msg;
    }

    public MyException(ErrorEnum resultCode) {
        this.errorCode = resultCode.getCode();
        this.message = resultCode.getMsg();
    }
}
