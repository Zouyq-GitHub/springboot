package com.gezhi.demo.pojo;

import lombok.Data;

/**
 * @author EkKo
 * @title: User
 * @projectName springboot
 * @description: TODO
 * @date 2019/10/17/9:29
 */
@Data
public class User {

    private int id;     //用户id

    private String loginName;   //用户名称

    private String passWord;    //用户密码

    private String userName;    //用户名称

    private String gander;      //用户性别
}
