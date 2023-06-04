package com.tan.oms.dao;

import com.tan.oms.entity.OrderDomain;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface OrderMapper {
    void save(@Param("orderDomain") OrderDomain orderDomain);
}
