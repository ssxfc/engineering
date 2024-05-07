package com.rtos.it.utils;

import com.rtos.it.entity.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author zhangwenwu
 * @Date 2024/5/7 22:44
 * @Version 1.8
 */
public class LoginCacheUtil {
    public static final Map<String, User> loginMap = new HashMap<>(16);
}
