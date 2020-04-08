package com.demo.vo;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author dreamStar
 * @create 2020-04-07 20:08
 */
@Component
public class User {
    private String userName;
    private String passWord;
    private Date createTime;
    private Date updateTime;
    public User() {
    }
    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public User(String userName, String passWord, Date createTime, Date updateTime) {
        this.userName = userName;
        this.passWord = passWord;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
