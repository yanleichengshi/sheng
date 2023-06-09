package com.tan.ums.req;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UserQueryReq {
    /**每页条数*/
    private Integer pageSize = 10;
    /**页码*/
    private Integer pageNum = 1;
    /**昵称*/
    private String nickName;
    /**手机号*/
    private String phone;
}
