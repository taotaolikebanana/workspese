package cn.kgc.controller;

import cn.kgc.entity.NBUser;
import cn.kgc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/hello")
    public Map weiWu(){
        HashMap map = new HashMap();
        map.put("9501","WeiWu");
        return map;
    }

    @RequestMapping("/user/listuser")
    public List<NBUser> getUserList(){
        return  userMapper.getUserList();
    }
}
