package cn.kgc.demo.service;

import cn.kgc.demo.entity.User;

public interface UserService {
    public User login(String loginId,String loginPwd);
}
