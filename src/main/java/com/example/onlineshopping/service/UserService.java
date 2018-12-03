package com.example.onlineshopping.service;

import com.example.onlineshopping.entity.User;

import javax.jws.soap.SOAPBinding;

public interface UserService {

    User findByuserNameAndpassword(String userName,String password);

    User findByuserName(String username);
}
