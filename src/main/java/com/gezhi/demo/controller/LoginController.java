package com.gezhi.demo.controller;

import com.gezhi.demo.pojo.User;
import com.gezhi.demo.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author EkKo
 * @title: loginController
 * @projectName springboot
 * @description: TODO
 * @date 2019/10/17/9:26
 */
@Controller
@RequestMapping("/login")
@Api("LoginController")
public class LoginController {

    @Autowired
    private LoginService loginService;

   /* @ApiImplicitParams({
            @ApiImplicitParam(paramType = "header", name = "loginName", dataType = "String", required = true, value = "用户的姓名"),
            @ApiImplicitParam(paramType = "query", name = "passWord", dataType = "String", required = true, value = "用户的密码")
    })*/


    @PostMapping("/login")
    /*public String loginNameAndPassWordByLogin(@RequestHeader("loginName") String loginName, @RequestHeader("passWord") String passWord) {*/
    public String loginNameAndPassWordByLogin(String loginName, String passWord) {
        //接收传入的登录账号和密码
        User user = loginService.loginNameAndPassWordByLogin(loginName, passWord);
        //判断用户密码是否正确 返回主页或登录页面
        if (user == null) {
            return "/index";
        }
        return "/home";
    }

  /*  @PostMapping("/login12")
    public String loginNameAndPassWordByLogin() {
        System.out.println("134t");
        return "/Home";
    }*/

    /**
     * 登录页面
     *
     * @return 返回到登录的主页面
     */
    @GetMapping("/index")
    public String test() {
        return "/index";
    }

   /* @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1(@RequestHeader("a") String a, @RequestHeader("b") String b) {
        System.out.println(a);
        System.out.println(b);
        return a + "-" + b;
    }*/
}
