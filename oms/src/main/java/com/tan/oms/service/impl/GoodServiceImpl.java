package com.tan.oms.service.impl;

import com.tan.common.cons.LogEnum;
import com.tan.common.exception.MyException;
import com.tan.common.resp.ErrorEnum;
import com.tan.common.resp.R;
import com.tan.common.resp.ResultCode;
import com.tan.common.utils.SnowFlakeUtil;
import com.tan.oms.apifeign.pojo.UserPojo;
import com.tan.oms.apifeign.service.UserApiService;
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

    @Resource
    private UserApiService userApiService;

    @Override
    public boolean add(GoodsEntity goodsEntity) {
        GoodsEntity goods = goodsDao.checkExit(goodsEntity.getGoodsName(), goodsEntity.getGoodsType());
        if (Objects.nonNull(goods)) {
            log.error("{} system, the {} has the {}", LogEnum.DB_SYSTEEM, goodsEntity.getGoodsType(), goodsEntity.getGoodsName());
            return false;
        }
        goodsEntity.setId(SnowFlakeUtil.getSnowFlakeId());
        boolean save = goodsDao.save(goodsEntity);
        return save;
    }

    @Override
    public GoodsEntity queryById(Long id) {
        GoodsEntity goods = goodsDao.queryById(id);
        if (Objects.isNull(goods)) {
            throw new MyException(ErrorEnum.OMS_GOODS_NOT_EXIT);
        }
        return goods;
    }

    @Override
    public UserPojo queryUser(Long id) {
        R<UserPojo> result = userApiService.getInfos(id);
        if (Objects.equals(result.getCode(), ResultCode.SUCCESS.getCode())) {
            throw new MyException(ErrorEnum.UMS_USER_NOT_EXIT);
        }
        return result.getData();
    }
}
