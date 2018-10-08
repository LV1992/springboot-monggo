package com.mongo;

import com.mongo.mapper.UserDao;
import com.mongo.model.UserModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMongoApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void saveUser() {
        UserModel user = new UserModel();
        user.setId(100l);
        user.setUserName("TEST");
        user.setPassword("PASS_WORD");
        userDao.saveUser(user);
    }


    @Test
    public void findUserByUserName(){
        UserModel user= userDao.findUserByUserName("TEST");
        System.out.println("user is "+user);
    }
}
