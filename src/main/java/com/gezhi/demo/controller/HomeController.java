package com.gezhi.demo.controller;

import com.gezhi.demo.service.HomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author EkKo
 * @title: HomeController
 * @projectName springboot
 * @description: TODO
 * @date 2019/10/18/14:11
 */
@Controller
@RequestMapping("/Home")
@Api("HomeController")
public class HomeController {

    @Autowired
    private HomeService homeService;

    /**
     * 跳转到帖子页面的方法
     * @return 返回帖子页面
     */
    @GetMapping("/inViVaTiOn")
    public String inViVaTiOn() {
        return "/invitation";
    }
}
