package com.rtos.it.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

/**
 * @Author zhangwenwu
 * @Date 2024/5/7 23:07
 * @Version 1.8
 */
@Configuration
public class MyConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
