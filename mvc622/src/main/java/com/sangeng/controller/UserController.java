package com.sangeng.controller;

import com.sangeng.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller

public class UserController {

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String findUserById(@PathVariable("id") Integer id) {
        System.out.println(id);
        System.out.println("findUserById");
        return "/success.jsp";
    }


    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public String insertUser(@RequestBody List<User> users) {
        System.out.println("insertUser");
        System.out.println(users);
        return "/success.jsp";
    }



}
