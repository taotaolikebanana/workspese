package com.taotao.my.shop.dao;

import com.taotao.my.shop.entity.User;

/**
 * @auther 姜志涛
 * @Date 2019/9/4 0004
 * @Time 下午 18:38
 */
public interface UserDao {

    /**
     *  根据邮箱和密码获取用户信息
     * @param email
     * @param password
     * @return  返回用户对象
     */
    public User getUser(String email,String password);


}
