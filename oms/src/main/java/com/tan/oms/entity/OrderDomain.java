package com.tan.oms.entity;

import lombok.Data;

@Data
public class OrderDomain {
    /**
     * 主键ID
     */
    private Integer Id;

    private Integer shardingDbId;

    private Integer shardingTableId;

    public OrderDomain(Integer shardingDbId, Integer shardingTableId) {
        this.shardingDbId = shardingDbId;
        this.shardingTableId = shardingTableId;
    }

    public OrderDomain() {
    }
}
