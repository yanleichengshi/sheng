package com.tan.orders.entity;

import lombok.Data;

@Data
public class UserEntity extends BaseEntity{
    private Integer id;
    private String userName;
    private String pwd;
    private String state;
}
