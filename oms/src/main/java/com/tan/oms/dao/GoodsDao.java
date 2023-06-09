package com.tan.oms.dao;

import com.tan.oms.apifeign.pojo.UserPojo;
import com.tan.oms.entity.GoodsEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GoodsDao {
    GoodsEntity checkExit(@Param("name") String goodsName, @Param("type") String goodsType);

    boolean save(@Param("addInfo") GoodsEntity goodsEntity);

    GoodsEntity queryById(@Param("id") Long id);
}
