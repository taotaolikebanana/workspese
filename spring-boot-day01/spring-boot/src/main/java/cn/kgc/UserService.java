package cn.kgc;

import cn.kgc.dao.UserDao;
import cn.kgc.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    @Transactional
    public void updateUserName(){
        Optional<User> optional = userDao.findById(2);
        User user = optional.get();
        user.setUsername("刘大仙");

        userDao.save(user);
    }
}
