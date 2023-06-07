package com.tan.oms.service.impl;

import com.tan.common.cons.LogEnum;
import com.tan.common.utils.SnowFlakeUtil;
import com.tan.oms.dao.GoodsDao;
import com.tan.oms.entity.GoodsEntity;
import com.tan.oms.service.GoodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Objects;

@Slf4j
@Service
public class GoodServiceImpl implements GoodService {
    @Resource
    private GoodsDao goodsDao;

    @Override
    public boolean add(GoodsEntity goodsEntity) {
        GoodsEntity goods = goodsDao.checkExit(goodsEntity.getGoodsName(), goodsEntity.getGoodsType());
        if (Objects.isNull(goods)) {
            log.error("{} system, the {} has the {}", LogEnum.DB_SYSTEEM, goods.getGoodsType(), goodsEntity.getGoodsName());
            return false;
        }
        goodsEntity.setId(SnowFlakeUtil.getSnowFlakeId());
        return goodsDao.save(goodsEntity);
    }
}
