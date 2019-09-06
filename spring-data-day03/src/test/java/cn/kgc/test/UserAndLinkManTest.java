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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserAndLinkManTest {

    @Autowired
    UserDao userDao;
    @Autowired
    LinkManDao linkManDao;
    @Transactional
    @Test
    @Rollback(false)
    public void testCreatUserAndLinkMan(){
        User user = new User();
        user.setUserName("张三");
        user.setUserPhone("123");
        user.setUserEmail("12311@.com");
        user.setUserAge(22);

        LinkMan linkMan = new LinkMan();
        linkMan.setLkmName("李四");
        linkMan.setLkmEmail("4455@.com");
        linkMan.setLkmGender("女");
        linkMan.setLkmMemo("咔咔");
        linkMan.setLkmMobile("987654");
        linkMan.setLkmPhone("119");
        linkMan.setLkmPosition("业务");
        user.getLinkMans().add(linkMan);
        userDao.save(user);
        linkManDao.save(linkMan);
    }

    @Transactional
    @Test
    @Rollback(false)
    public void testCreatLinkManAndUser(){
        User user = new User();
        user.setUserName("张三");
        user.setUserPhone("123");
        user.setUserEmail("12311@.com");
        user.setUserAge(22);

        LinkMan linkMan = new LinkMan();
        linkMan.setLkmName("李四");
        linkMan.setLkmEmail("4455@.com");
        linkMan.setLkmGender("女");
        linkMan.setLkmMemo("咔咔");
        linkMan.setLkmMobile("987654");
        linkMan.setLkmPhone("119");
        linkMan.setLkmPosition("业务");
//        linkMan.setUser(user);
        userDao.save(user);
        linkManDao.save(linkMan);
    }

    @Transactional
    @Test
    @Rollback(false)
    public void testCreateTable(){
        User user = new User();
        user.setUserName("张三");
        user.setUserPhone("123");
        user.setUserEmail("12311@.com");
        user.setUserAge(22);

        LinkMan linkMan = new LinkMan();
        linkMan.setLkmName("李四");
        linkMan.setLkmEmail("4455@.com");
        linkMan.setLkmGender("女");
        linkMan.setLkmMemo("咔咔");
        linkMan.setLkmMobile("987654");
        linkMan.setLkmPhone("119");
        linkMan.setLkmPosition("业务");

//        linkMan.setUser(user);
        user.getLinkMans().add(linkMan);
        userDao.save(user);
        linkManDao.save(linkMan);
    }
    @Transactional
    @Test
    @Rollback(false)
    public void testDelete(){
        User one = userDao.findOne(1l);
        userDao.delete(one);
    }
}
