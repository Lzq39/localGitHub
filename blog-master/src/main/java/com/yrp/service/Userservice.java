package com.yrp.service;

import com.yrp.po.User;

public interface Userservice {

    /**
     * 用户登录检测
     * @param
     * @return
     */
    User checkUser(String username,String password);

}
