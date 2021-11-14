package com.lt.core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String getHello() {
        return "hello";
    }
}
