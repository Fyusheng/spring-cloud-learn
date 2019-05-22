package com.fl.serviceribbon.controller;

import com.fl.serviceribbon.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version : 1.0
 * @ClassName: TestController
 * @Description: TODD
 * @Auther: FL
 * @Date: 2019/5/8
 **/
@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return testService.getService(name);
    }
}
