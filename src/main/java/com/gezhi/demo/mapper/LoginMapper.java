package com.gezhi.demo.mapper;

import com.gezhi.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author EkKo
 * @title: loginMapper
 * @projectName springboot
 * @description: TODO
 * @date 2019/10/17/10:34
 */
@Mapper
public interface LoginMapper {
    User loginNameAndPassWordByLogin(@Param("loginName") String loginName, @Param("passWord") String passWord);
}
