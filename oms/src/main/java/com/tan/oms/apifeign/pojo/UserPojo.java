package com.tan.oms.apifeign.pojo;

import com.tan.common.base.BaseEntity;
import lombok.Data;

@Data
public class UserPojo extends BaseEntity {
    /**主键id*/
    private Long id;
    /**昵称*/
    private String nickName;
    /**密码*/
    private String pwd;
    /**手机号*/
    private String phone;
    /**性别*/
    private String sex;
    /**住址*/
    private String address;
}
