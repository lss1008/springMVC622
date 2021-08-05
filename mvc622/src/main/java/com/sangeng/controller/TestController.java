package com.sangeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {


    @RequestMapping("/testHello")
    public ModelAndView hello() {
        System.out.println("testHello");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "sangeng");
        modelAndView.setViewName("/success.jsp");
        return modelAndView;
    }

    //@RequestMapping(value = "/testMethod", method = RequestMethod.POST)
    @PostMapping("/testMethod")
    public String testMethod() {

        System.out.println("testMethod");
        return "/success.jsp";
    }

    @RequestMapping(value = "/testC", method = RequestMethod.POST, consumes = "multipart/from-data")
    public String testC() {
        System.out.println("testC");
        return "/success.jsp";
    }


    @RequestMapping(value = "/testCA", method = RequestMethod.GET, headers = "!deviceType")
    public String testCA() {
        System.out.println("testC");
        return "/success.jsp";
    }

}
