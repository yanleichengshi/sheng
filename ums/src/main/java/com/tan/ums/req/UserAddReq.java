package com.tan.ums.req;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UserAddReq {
    /**昵称*/
    @NotEmpty
    private String nickName;
    /**密码*/
    @NotEmpty
    private String pwd;
    /**手机号*/
    @NotEmpty
    private String phone;
    /**性别*/
    private String sex;
    /**住址*/
    private String address;
    /**角色*/
    private String role;
}
