package com.example.onlineshopping.service.impl;

import com.example.onlineshopping.dao.UseDao;
import com.example.onlineshopping.entity.User;
import com.example.onlineshopping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UseDao useDao;


    @Override
    public User findByuserNameAndpassword(String userName, String password) {
        return useDao.findByUserNameAndPassword(userName,password);
    }

    @Override
    public User findByuserName(String username) {
        return useDao.findByUserName(username);
    }
}
