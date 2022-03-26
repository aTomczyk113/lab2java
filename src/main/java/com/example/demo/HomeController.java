package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/example")
    @ResponseBody
    public String index() {
        return "Hello World!";
    }

    @RequestMapping("/example2/{name}/{age}")
    @ResponseBody
    public String example2(
            @PathVariable String name,
            @PathVariable int age,
            @RequestParam(required = false) String parameter1,
            @RequestParam(required = false) Boolean parameter2
    ) {
        return "example2 message! "
                +name +"" +age +parameter1 +parameter2;
    }
}