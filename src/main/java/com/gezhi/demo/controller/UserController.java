package com.gezhi.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EkKo
 * @title: UserController
 * @projectName springboot
 * @description: TODO
 * @date 2019/10/16/9:38
 */

@RestController
@Api("UserController相关api")
public class UserController {

    @Value("${id}")
    private String id;     //用户id

    @Value("${loginName}")
    private String loginName;    //用户登录名称

    @Value("${passWord}")
    private String passWord;    // 用户登录密码

    @Value("${userName}")
    private String userName;    //用户名

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String user() {
        return "第" + id + "号用户" + userName + "你好！你的账号为:" + loginName + "你的密码为:" + passWord;
    }
}
