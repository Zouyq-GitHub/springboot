package com.gezhi.demo.service;

import com.gezhi.demo.mapper.LoginMapper;
import com.gezhi.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * @author EkKo
 * @title: LoginService
 * @projectName springboot
 * @description: TODO
 * @date 2019/10/17/10:46
 */
@Service
public class LoginService implements Serializable {

    @Autowired
    private LoginMapper loginMapper;

    public User loginNameAndPassWordByLogin(String loginName, String passWord) {
        return loginMapper.loginNameAndPassWordByLogin(loginName, passWord);
    }
}
