package com.taotao.my.shop.service.impl;

import com.taotao.my.shop.commons.context.SpringContext;
import com.taotao.my.shop.dao.UserDao;
import com.taotao.my.shop.entity.User;
import com.taotao.my.shop.service.UserService;

/**
 * @auther 姜志涛
 * @Date 2019/9/4 0004
 * @Time 下午 18:46
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = SpringContext.getBean("userDao");


    public User login(String mail, String password) {

        return userDao.getUser(mail, password);
    }
}
