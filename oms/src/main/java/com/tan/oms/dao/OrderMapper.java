package com.tan.oms.dao;

import com.tan.oms.entity.OrderDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {
    void save(@Param("orderDomain") OrderDomain orderDomain);
}
