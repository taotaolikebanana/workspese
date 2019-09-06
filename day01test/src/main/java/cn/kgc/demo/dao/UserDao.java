package cn.kgc.demo.dao;

import cn.kgc.demo.entity.User;

/**
 * @author taotao
 * @date new Date()
 */
public interface UserDao {
    public User login (String loginId, String loginPwd);
}
