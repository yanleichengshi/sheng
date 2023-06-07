package com.tan.oms.req;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public class AddGoodsReq {
    /**
     * 商品名称
     */
    @NotBlank
    private String goods_name;
    /**
     * 商品数量
     */
    @Min(0)
    private Integer goods_num;
    /**
     * 商品生产时间
     */
    @NotBlank
    private Date start_time;
    /**
     * 商品最后有效时间
     */
    @NotBlank
    private Date end_time;
    /**
     * 商品类型
     */
    private String goods_type;
    /**
     * 商品价格
     */
    @Min(0)
    private Integer price;
}
