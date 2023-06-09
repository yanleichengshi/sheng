package com.tan.oms.apifeign.service;

import com.alibaba.fastjson.JSONObject;
import com.tan.common.resp.R;
import com.tan.oms.apifeign.pojo.UserPojo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ums", path = "/ums")
public interface UserApiService {

    @GetMapping(value = "/user/queryById")
    R<UserPojo> getInfos(@RequestParam Long id);
}
