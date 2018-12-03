package com.example.onlineshopping.service.impl;

import com.example.onlineshopping.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserServiceImpl userService;

    @Test
    public void findByuserNameAndpassword() {
        User user = userService.findByuserNameAndpassword("Tom","123456");
        Assert.assertNotNull(user);
    }

    @Test
    public void findByuserName() {

        User user = userService.findByuserName("Tom");
        Assert.assertNotNull(user);
    }
}