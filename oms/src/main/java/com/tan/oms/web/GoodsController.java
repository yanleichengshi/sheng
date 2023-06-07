package com.tan.oms.web;

import com.tan.common.resp.ErrorEnum;
import com.tan.common.resp.R;
import com.tan.oms.entity.GoodsEntity;
import com.tan.oms.req.AddGoodsReq;
import com.tan.oms.service.GoodService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Resource
    private GoodService goodService;

    @PostMapping("/add")
    public R add(@RequestBody AddGoodsReq req) {
        GoodsEntity goodsEntity = new GoodsEntity();
        BeanUtils.copyProperties(req, goodsEntity);
        if (goodService.add(goodsEntity)) {
            return R.success();
        }
        return R.fail(ErrorEnum.ADD_FAIL.getMsg());
    }
}
