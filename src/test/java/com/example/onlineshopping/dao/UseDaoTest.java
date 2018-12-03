package com.example.onlineshopping.dao;

import com.example.onlineshopping.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jws.soap.SOAPBinding;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UseDaoTest {

    @Autowired
    private UseDao useDao;

    @Test
    public void saveTest(){
        User user = new User("Tom","123456");
        User result = useDao.save(user);
        Assert.assertNotNull(result);
    }

    @Test
    public void removeTest(){
        useDao.deleteById(2);
    }

    @Test
    public void findBbynameAndpasswordTest(){
        User result = useDao.findByUserNameAndPassword("Tom","123456");
        Assert.assertNotNull(result);
    }


}