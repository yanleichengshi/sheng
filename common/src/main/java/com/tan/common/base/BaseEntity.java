package com.tan.common.base;

import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {
    /**删除标志:1未删除,0删除*/
    private String delFlag;
    /**创建时间*/
    private Date createTime;
    /**更新时间*/
    private Date updateTime;
}
