package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String getInfo() {
        return "index";
    }

    @GetMapping("/test")
    public String testing() {
        return "signup";
    }

}
