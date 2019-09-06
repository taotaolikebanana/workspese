package cn.kgc.controller;

import cn.kgc.dao.UserDao;
import cn.kgc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class UserController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/user/list")
    public String findAll(Model model){
        List<User> userList = userDao.findAll();
        model.addAttribute("userList",userList);
        return "user";
    }


}
