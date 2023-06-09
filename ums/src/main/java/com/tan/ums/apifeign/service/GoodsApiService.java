package com.tan.ums.apifeign.service;

import com.tan.common.resp.R;
import com.tan.ums.apifeign.pojo.GoodsPojo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "oms", path = "/oms")
public interface GoodsApiService {

    @GetMapping(value = "/goods/queryById")
    R<GoodsPojo> getInfos(@RequestParam Long id);
}
