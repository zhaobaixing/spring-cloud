package com.txpc.txpccloud.sms.base;

import com.txpc.txpccloud.sms.dto.ResponseDTO;
import com.txpc.txpccloud.sms.dto.SendDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @ProjectName: txpccloud-sms
 * @Package: com.txpc.txpccloud.sms.base
 * @ClassName: SmsSend
 * @Author: zbx
 * @Description:
 * @Date: 2019/6/5 16:00
 * @Version: 1.0
 */
@Component
public class SmsSend {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private SmsCloudProperties smsCloudProperties;

    public boolean sendSms(SendDTO sendDTO){
        BeanUtils.copyProperties(smsCloudProperties,sendDTO);
        ResponseEntity<ResponseDTO> responseEntity = restTemplate.postForEntity(smsCloudProperties.sendUrl,sendDTO, ResponseDTO.class);
        if (responseEntity.getStatusCode()!= HttpStatus.OK||
                responseEntity.getBody().getError()!=0){
            //TODO 加入队列重发
            return false;
        }
        return true;
    }
}
