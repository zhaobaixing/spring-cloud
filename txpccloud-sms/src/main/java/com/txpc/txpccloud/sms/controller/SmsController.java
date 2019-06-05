package com.txpc.txpccloud.sms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: txpccloud-sms
 * @Package: com.txpc.txpccloud.sms.controller
 * @ClassName: SmsController
 * @Author: zbx
 * @Description:
 * @Date: 2019/6/5 14:13
 * @Version: 1.0
 */
@RestController
public class SmsController {

    @RequestMapping("/batch-sms-send")
    public Object batchSend(){

        return null;
    }

    @RequestMapping("/sms-send")
    public Object send(){

        return null;
    }
}
