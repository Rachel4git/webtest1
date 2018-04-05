package com.hou.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hd48552 on 2018/3/12.
 */
@Controller
@RequestMapping("/home")
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
