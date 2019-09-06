package com.taotao.my.shop.entity;

import java.io.Serializable;

/**
 * @auther 姜志涛
 * @Date 2019/9/4 0004
 * @Time 下午 18:35
 */
public class User implements Serializable {
    private String username;
    private String password;
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
