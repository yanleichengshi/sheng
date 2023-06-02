package com.tan.orders.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class UserEntity extends BaseEntity{
    private Integer id;
    @NonNull
    private String userName;
    @NonNull
    private String pwd;
    private Integer soleId;
}
