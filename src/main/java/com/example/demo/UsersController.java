package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsersController {

    @RequestMapping("/users")
    public String users(){
        return "index";
    }

    @RequestMapping("/users2")
    public String users2(){
        return "example2";
    }
}