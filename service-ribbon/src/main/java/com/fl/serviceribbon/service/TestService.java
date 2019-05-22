package com.fl.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @version : 1.0
 * @ClassName: TestService
 * @Description: TODD
 * @Auther: FL
 * @Date: 2019/5/8
 **/
@Service
public class TestService {

    private final
    RestTemplate restTemplate;

    @Autowired
    public TestService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @HystrixCommand(fallbackMethod = "hiError")
    public String getService(String name){
        return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name="+name,String.class);
    }

    // 熔断方法
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
