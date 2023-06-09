package com.tan.ums.apifeign.pojo;

import com.tan.common.base.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class GoodsPojo extends BaseEntity {
    /**
     * 主键ID
     */
    private Long Id;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品数量
     */
    private Integer goodsNum;
    /**
     * 商品生产时间
     */
    private Date startTime;
    /**
     * 商品最后有效时间
     */
    private Date endTime;
    /**
     * 商品类型
     */
    private String goodsType;
    /**
     * 商品价格
     */
    private Integer price;
}
