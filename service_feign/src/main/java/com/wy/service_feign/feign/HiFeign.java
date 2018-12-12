package com.wy.service_feign.feign;

import com.wy.service_feign.feignbreak.HiFeignBreak;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangy
 * @Description:
 * @date 2018/11/27
 */
@FeignClient(name = "hi",fallback = HiFeignBreak.class)
public interface HiFeign {

    @GetMapping("/hi")
    String getHi(@RequestParam(value = "name") String name);
}
