package com.demo.service;

import com.demo.vo.User;

/**
 * @author dreamStar
 * @create 2020-04-08 15:21
 */
public interface UserService {

    User getUser(Integer id);

    //添加了事务注解的
    User getUser2(Integer id);

   // void registerUser(User user);
}
