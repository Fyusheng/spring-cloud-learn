package com.fl.servicefeign.FeignHystrix;

import com.fl.servicefeign.service.TestFeign;
import org.springframework.stereotype.Component;

/**
 * @version : 1.0
 * @ClassName: FeignServiceFallbackFactory
 * @Description: 熔断方法
 * @Auther: FL
 * @Date: 2019/5/20
 **/
@Component
public class FeignServiceFallbackFactory implements TestFeign {

    @Override
    public String getServiceInfo(String name) {
        return "hi,"+name+",sorry,error!";
    }

}

