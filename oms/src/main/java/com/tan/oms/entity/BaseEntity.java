package com.tan.oms.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseEntity {
    private String delFlag;
    private String createUser;
    private LocalDateTime createTime;
    private String updateUser;
    private LocalDateTime updateTime;
}
