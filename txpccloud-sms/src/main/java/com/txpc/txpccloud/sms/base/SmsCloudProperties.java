package com.txpc.txpccloud.sms.base;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: txpccloud-sms
 * @Package: com.txpc.txpccloud.sms.base
 * @ClassName: SmsCloudProperties
 * @Author: zbx
 * @Description:
 * @Date: 2019/6/6 9:40
 * @Version: 1.0
 */
@Component
@ConfigurationProperties(prefix ="com.txpc.txpccloud.sms")
public class SmsCloudProperties {
    /**
     * 单条发送地址
     * */
    public String sendUrl;
    /**
     * 单条发送地址
     * */
    public String bathServer;

    /**
     * 账号
     * */
    public String apName;
    /**
     * 密码
     * */
    public String apPassword;

    public String getSendUrl() {
        return sendUrl;
    }

    public void setSendUrl(String sendUrl) {
        this.sendUrl = sendUrl;
    }

    public String getBathServer() {
        return bathServer;
    }

    public void setBathServer(String bathServer) {
        this.bathServer = bathServer;
    }

    public String getApName() {
        return apName;
    }

    public void setApName(String apName) {
        this.apName = apName;
    }

    public String getApPassword() {
        return apPassword;
    }

    public void setApPassword(String apPassword) {
        this.apPassword = apPassword;
    }
}
