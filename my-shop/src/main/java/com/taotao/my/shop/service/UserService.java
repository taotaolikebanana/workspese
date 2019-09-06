package com.taotao.my.shop.service;

import com.taotao.my.shop.entity.User;

/**
 * @auther 姜志涛
 * @Date 2019/9/4 0004
 * @Time 下午 18:45
 */
public interface UserService {

    /**
     * 登录
     * @param mail      邮箱
     * @param password  密码
     * @return
     */
    public User login (String mail, String password);
}
