package com.yrp.service.impl;

import com.yrp.dao.UserRepository;
import com.yrp.po.User;
import com.yrp.service.Userservice;
import com.yrp.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements Userservice {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        System.out.println(username);
        System.out.println(password);
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        System.out.println(MD5Utils.code(password));
        return user;
    }
}
