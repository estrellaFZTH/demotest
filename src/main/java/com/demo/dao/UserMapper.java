package com.demo.dao;

import com.demo.vo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author dreamStar
 * @create 2020-04-07 20:14
 */
public interface UserMapper {

    //注解式查找数据库
    @Select("select * from user where id=#{id}")
    User findUserById(Integer id);

    @Select("select * from user where username = #{userName}")
    User findUserByUserName(String userName);

    //xml式查找数据库，需要配置一个xml文件，在xml文件里将方法与相应的sql语句对应起来。
    int insertUser(User user);

    int updateUserById(Integer id);
}
