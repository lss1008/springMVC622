package com.sangeng.controller;

import com.sangeng.pojo.User;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/response")
public class ResponseController {

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public List<User> testResponse() {
        List<User> list = new ArrayList<User>();
        list.add(new User(1, "三更", 15));
        list.add(new User(2, "四更", 16));
        list.add(new User(3, "五更", 17));
        return list;
    }

    @RequestMapping("/getHeader")
    public String getHeader(@RequestHeader(value = "device-type") String deviceType) {

        System.out.println(deviceType);
        return "/success.jsp";
    }

    @RequestMapping("/getCookie")
    public String getCookie(@CookieValue("JSESSIONID") String cid) {
        System.out.println("getCookie");
        System.out.println(cid);
        return "/success.jsp";
    }
}
