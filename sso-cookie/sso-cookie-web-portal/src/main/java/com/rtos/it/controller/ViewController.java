package com.rtos.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Author zhangwenwu
 * @Date 2024/5/7 22:50
 * @Version 1.8
 */
@Controller
@RequestMapping("/view")
public class ViewController {

    @Autowired
    private RestTemplate restTemplate;

    private final static String REMOTE_LOGIN_INFO_ADDRESS = "http://127.0.0.1:8081/login/info?token=";

    @GetMapping("/index")
    public String toIndex(@CookieValue(required = false, value = "TOKEN") Cookie cookie, HttpSession session){
        if (cookie != null){
            String token = cookie.getValue();
            if (!StringUtils.isEmpty(token)){
                // 尝试获取登录信息
                Map result = restTemplate.getForObject(REMOTE_LOGIN_INFO_ADDRESS + token, Map.class);
                session.setAttribute("loginUser",result);
            }
        }
        return "index";
    }
}
