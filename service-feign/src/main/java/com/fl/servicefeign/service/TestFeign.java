package com.fl.servicefeign.service;

import com.fl.servicefeign.FeignHystrix.FeignServiceFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * eureka-client:是一个服务提供者的实例名称
 * 用于标记一个可用的服务的名称，同时创建一个Ribbon负载均衡器
 * fallbackFactory指定用于处理服务提供者服务异常过程的类
 * 该接口用于实现与服务提供者进行交互，接口中的方法与服务提供者需要暴露的方法一一对应
 */
@FeignClient(value = "eureka-client",fallback = FeignServiceFallbackFactory.class)
public interface TestFeign {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String getServiceInfo(@RequestParam(value = "name") String name);

}
