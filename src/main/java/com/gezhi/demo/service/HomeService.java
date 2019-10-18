package com.gezhi.demo.service;

import com.gezhi.demo.mapper.HomeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author EkKo
 * @title: HomeService
 * @projectName springboot
 * @description: TODO
 * @date 2019/10/18/14:13
 */
@Service
public class HomeService implements Serializable {

    @Autowired
    private HomeMapper homeMapper;


}
