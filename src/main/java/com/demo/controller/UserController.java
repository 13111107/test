package com.demo.controller;

import com.demo.dao.UserDao;
import com.demo.service.UserService;
import com.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;
    @Autowired
    private UserDao userDao;

    @RequestMapping("/showUser")
    @ResponseBody
    public User toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        System.out.println("userid ====== " + userId);
//        User user = this.userService.getUserById(userId);
        User user = userDao.selectByPrimaryKey(userId);
        return user;
    }

}
