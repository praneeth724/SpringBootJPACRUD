package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String Greeting(){
        return  "Hello World";
    }

    @RequestMapping("/about")
    public  String About(){
        return "This is About Section";
    }
}

