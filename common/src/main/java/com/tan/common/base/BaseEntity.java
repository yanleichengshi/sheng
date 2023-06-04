package com.tan.common.base;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BaseEntity {
    /**删除标志:1未删除,0删除*/
    private String delFlag;
    /**创建时间*/
    private LocalDateTime createTime;
    /**更新时间*/
    private LocalDateTime updateTime;
}
