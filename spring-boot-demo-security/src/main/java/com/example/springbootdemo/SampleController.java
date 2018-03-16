package com.example.springbootdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    Map<String, String> home() {
        Map<String, String> map = new HashMap<>();
        map.put("say", "Hello World!");
        return map;
    }

    @RequestMapping("/users")
    public String users() {
        return "users";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

}
