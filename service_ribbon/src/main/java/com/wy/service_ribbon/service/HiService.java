package com.wy.service_ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author wangy
 * @Description:
 * @date 2018/11/27
 */
@Service
public class HiService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hierr")
    public String getHi(String name){
        return restTemplate.getForObject("http://HI/hi?name="+name,String.class);
    }

    public String hierr(String name){
        return "err，进入ribbon断路";
    }
}
