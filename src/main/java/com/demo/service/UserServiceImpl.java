package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;


    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }


}
