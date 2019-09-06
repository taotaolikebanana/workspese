package cn.kgc.controller;

import cn.kgc.entity.Person;
import cn.kgc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private Person person;
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/person")
    public Person findByPerson(){
        return person;
    }

}
