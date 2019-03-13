package com.demo.dao;

import com.demo.entity.User;

public interface UserDao {


    User selectByPrimaryKey(Integer id);


}