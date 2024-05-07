package com.rtos.it.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author zhangwenwu
 * @Date 2024/5/7 22:46
 * @Version 1.8
 */
@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String password;
}
