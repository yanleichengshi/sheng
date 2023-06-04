package com.tan.oms.web;

import com.tan.oms.dao.OrderMapper;
import com.tan.oms.entity.OrderDomain;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/orders")
@MapperScan(basePackages = {"com.tan.oms.dao"})
public class OdersController {
    @Resource
    private OrderMapper orderMapper;

    @GetMapping("/add")
    public void add() {
        orderMapper.save(new OrderDomain(5, 1));
    }
}
