package com.demo.service.impl;

import com.demo.dao.UserMapper;
import com.demo.service.UserService;
import com.demo.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author dreamStar
 * @create 2020-04-08 15:21
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public User getUser(Integer id) {
        return userMapper.findUserById(id);
    }

    @Override
    @Transactional()
    public User getUser2(Integer id) {
        return userMapper.findUserById(id);
    }
//    @Override
//    public void registerUser(User user) {
//        userMapper.
//    }
}
