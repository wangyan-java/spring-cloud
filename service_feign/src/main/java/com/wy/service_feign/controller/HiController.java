package com.wy.service_feign.controller;

import com.wy.service_feign.feign.HiFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangy
 * @Description:
 * @date 2018/11/27
 */
@RestController
public class HiController {
    @Autowired
    private HiFeign hiFeign;

    @GetMapping("/hi")
    public String gethi(@RequestParam(value = "name",defaultValue = "wy") String name){
        return hiFeign.getHi(name);
    }
}
