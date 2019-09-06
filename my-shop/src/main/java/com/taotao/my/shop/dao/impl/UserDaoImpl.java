package com.taotao.my.shop.dao.impl;

import com.taotao.my.shop.dao.UserDao;
import com.taotao.my.shop.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * @auther 姜志涛
 * @Date 2019/9/4 0004
 * @Time 下午 18:41
 */
public class UserDaoImpl implements UserDao {
    private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

    public User getUser(String email, String password) {
        logger.debug("调用 getUser(), email:{} password:{}",email,password);
        User user = null;

        if ("admin@funtl.com".equals(email)) {
            if ("admin".equals(password)) {
                user = new User();
                user.setEmail("admin@funtl.com");
                user.setUsername("taotao");

                logger.info("成功获取\"{}\"的用户信息",user.getUsername());
            }
        }else {
            logger.warn("获取\"{}\"的用户失败",email);
        }
        return user;
    }
}
