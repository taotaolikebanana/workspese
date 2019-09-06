package cn.kgc.demo.service.impl;

import cn.kgc.demo.dao.UserDao;
import cn.kgc.demo.dao.impl.UserDaoImpl;
import cn.kgc.demo.entity.User;
import cn.kgc.demo.service.UserService;

/**
 * @author taotao
 * @date new Date()
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    public User login(String loginId, String loginPwd) {
        return userDao.login(loginId,loginPwd);
    }
}
