package com.txpc.txpccloud.sms.dto;

/**
 * @ProjectName: txpccloud-sms
 * @Package: com.txpc.txpccloud.sms.dto
 * @ClassName: ResponseDTO
 * @Author: zbx
 * @Description:
 * @Date: 2019/6/5 16:29
 * @Version: 1.0
 */
public class ResponseDTO {
    public int error;
    public String message;
    public int successCnt;
    public String [] msisdn;
    public String [] msgId;

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getSuccessCnt() {
        return successCnt;
    }

    public void setSuccessCnt(int successCnt) {
        this.successCnt = successCnt;
    }

    public String[] getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String[] msisdn) {
        this.msisdn = msisdn;
    }

    public String[] getMsgId() {
        return msgId;
    }

    public void setMsgId(String[] msgId) {
        this.msgId = msgId;
    }
}
