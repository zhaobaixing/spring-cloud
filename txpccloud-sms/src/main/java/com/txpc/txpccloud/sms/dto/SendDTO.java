package com.txpc.txpccloud.sms.dto;


/**
 * @ProjectName: txpccloud-sms
 * @Package: com.txpc.txpccloud.sms.dto
 * @ClassName: SendDTO
 * @Author: zbx
 * @Description:
 * @Date: 2019/6/5 16:09
 * @Version: 1.0
 */
public class SendDTO {
    /**
     * 账号
     * */
    public String apName;
    /**
     * 密码
     * */
    public String apPassword;
    /**
     * 附加号
     * */
    public String srcId;
    /**
     * 回执传送的URL
     * */
    public String serviceId;
    /**
     * 发送手机号
     * */
    public String calledNumber;
    /**
     * 短信内容
     * */
    public String content;
    /**
     * 发送时间，为空则默认及时发送，时间格式为（yyyyMMddHHmmss）
     * */
    public String sendTime;

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

    public String getSrcId() {
        return srcId;
    }

    public void setSrcId(String srcId) {
        this.srcId = srcId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getCalledNumber() {
        return calledNumber;
    }

    public void setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }
}
