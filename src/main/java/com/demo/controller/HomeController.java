package com.demo.controller;

import com.demo.bean.Message;
import com.demo.entity.User;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test1")
public class HomeController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping(value="/save")
    public ModelAndView save(){
//        ModelAndView modelAndView = new ModelAndView();
//
//        modelAndView.setViewName("index1");
//        modelAndView.addObject("msg", "哈哈哈哈哈.....");
//        return modelAndView;
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");

        User u1 = new User(1,"liujiang","123");
        User u2 = new User(1,"xiaomajie","456");
        List<User> list = new ArrayList<User>();
        list.add(u1);
        list.add(u2);
        mav.addObject("userinfo", list);

        return mav;
    }
}
