package com.txpc.txpccloud.sms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: txpccloud-sms
 * @Package: com.txpc.txpccloud.sms.controller
 * @ClassName: TestController
 * @Author: zbx
 * @Description:
 * @Date: 2019/6/4 16:18
 * @Version: 1.0
 */
@RestController
public class TestController {

    @RequestMapping("test")
    public String test(){
        return "SUCCESS";
    }
}
