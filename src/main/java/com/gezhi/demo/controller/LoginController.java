package com.gezhi.demo.controller;

import com.gezhi.demo.pojo.User;
import com.gezhi.demo.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author EkKo
 * @title: loginController
 * @projectName springboot
 * @description: TODO
 * @date 2019/10/17/9:26
 */
@RestController
@Api("LoginController相关api")
public class LoginController {

    @Autowired
    private LoginService loginService;

   /* @ApiImplicitParams({
            @ApiImplicitParam(paramType = "header", name = "loginName", dataType = "String", required = true, value = "用户的姓名"),
            @ApiImplicitParam(paramType = "query", name = "passWord", dataType = "String", required = true, value = "用户的密码")
    })*/
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginNameAndPassWordByLogin(@RequestHeader("loginName") String loginName, @RequestHeader("passWord") String passWord) {
        User user = loginService.loginNameAndPassWordByLogin(loginName, passWord);
        return user.getUserName() + "" + user.getGander();
    }

    /*@RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test() {
        return "123";
    }

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1(@RequestHeader("a") String a, @RequestHeader("b") String b) {
        System.out.println(a);
        System.out.println(b);
        return a + "-" + b;
    }*/
}
