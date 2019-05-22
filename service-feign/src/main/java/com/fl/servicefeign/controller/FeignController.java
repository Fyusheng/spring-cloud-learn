package com.fl.servicefeign.controller;

import com.fl.servicefeign.service.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version : 1.0
 * @ClassName: FeignController
 * @Description: TODD
 * @Auther: FL
 * @Date: 2019/5/8
 **/
@RestController
public class FeignController {

    @Autowired
    TestFeign testFeign;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return testFeign.getServiceInfo( name );
    }



}
