package com.wy.service_ribbon.controller;

import com.wy.service_ribbon.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangy
 * @Description:
 * @date 2018/11/27
 */
@RestController
public class HiController {

    @Autowired
    private HiService hiService;

    @GetMapping("/hi")
    public String hi(String name){
        return hiService.getHi(name);
    }
}
