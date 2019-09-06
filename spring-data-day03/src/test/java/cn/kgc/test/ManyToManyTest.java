package cn.kgc.test;

import cn.kgc.dao.LinkManDao;
import cn.kgc.dao.UserDao;
import cn.kgc.pojo.LinkMan;
import cn.kgc.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ManyToManyTest {

    @Autowired
    UserDao userDao;
    @Autowired
    LinkManDao linkManDao;

    @Test
    public void testFindAll(){
        List<User> users = userDao.findAll();
        for(User user: users)
            System.out.println(user);
        List<LinkMan> linkMans = linkManDao.findAll();
        for(LinkMan linkMan: linkMans)
            System.out.println(linkMan);
    }

    @Test
    @Transactional
    @Rollback(false)
    public  void testFindUserAndLinkMan(){
        User user = new User();
        user.setUserName("张飞");
        user.setUserAge(9999);

        LinkMan linkMan = new LinkMan();
        linkMan.setLkmName("刘备");
        linkMan.setLkmGender("女");

        user.getLinkMans().add(linkMan);
        linkMan.getUser().add(user);

        userDao.save(user);
        linkManDao.save(linkMan);
    }

    //级联添加
    @Test
    public void testCasCadeAdd(){
        User user = new User();
        user.setUserName("张飞");
        user.setUserAge(9999);

        LinkMan linkMan = new LinkMan();
        linkMan.setLkmName("刘备");
        linkMan.setLkmGender("女");

        user.getLinkMans().add(linkMan);
        linkMan.getUser().add(user);

        userDao.save(user);
    }

    @Test
    @Transactional
    @Rollback(false)
    public void deleteById(){
        User one = userDao.findOne(2l);
        userDao.delete(one);
    }

    @Test
    @Transactional
    @Rollback(false)
    public void update (){
        User one = userDao.findOne(3l);
        one.setUserName("曹操");
        userDao.save(one);
    }
}
