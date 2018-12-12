package com.wy.service_feign.feignbreak;

import com.wy.service_feign.feign.HiFeign;
import org.springframework.stereotype.Component;

/**
 * @author wangy
 * @Description:
 * @date 2018/11/27
 */
@Component
public class HiFeignBreak implements HiFeign {

    @Override
    public String getHi(String name) {
        return "err,进入feign断路";
    }
}
