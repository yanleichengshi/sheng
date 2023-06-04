package com.tan.oms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
