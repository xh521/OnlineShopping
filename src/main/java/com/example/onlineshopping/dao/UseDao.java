package com.example.onlineshopping.dao;

import com.example.onlineshopping.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UseDao extends JpaRepository<User,Integer> {

    User findByUserNameAndPassword(String username,String password);

    User findByUserName(String username);
}
