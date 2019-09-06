package cn.kgc.demo.dao.impl;

import cn.kgc.demo.dao.UserDao;
import cn.kgc.demo.entity.User;

/**
 * @author taotao
 * @date new Date()
 */

public class UserDaoImpl implements UserDao {
    /**
     *
     * @param loginId   登录Id
     * @param loginPwd  登录密码
     * @return  String：登陆结果
     */
    public User login(String loginId, String loginPwd) {
        User user = null;
        if("admin".equals(loginId) ){
            if("admin".equals(loginPwd)){
                user = new User();
                user.setUsername("涛涛");
                user.setLoginId("admin");
                user.setLoginPwd("admin");
                return user;
            }
        }
        return user;
    }
}
