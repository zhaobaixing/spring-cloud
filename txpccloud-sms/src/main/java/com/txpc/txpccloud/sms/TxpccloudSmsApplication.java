package com.txpc.txpccloud.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TxpccloudSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TxpccloudSmsApplication.class, args);
    }

}
