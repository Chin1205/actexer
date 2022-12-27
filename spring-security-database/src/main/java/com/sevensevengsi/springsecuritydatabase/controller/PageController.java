package com.sevensevengsi.springsecuritydatabase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/all")
    public String forAll(){
        return "forAll/page1";
    }
    @GetMapping("/page/manager")
    public String forManager(){
        return "forAuthenticated/page3";
    }

    @GetMapping("/page/admin")
    public String forAdmin(){
        return "forAuthenticated/page2";
    }
    @GetMapping("/page/employee")
    public String forEmployee(){
        return "forAuthenticated/page4";
    }

    @GetMapping("/access-denied")
    public String forDenied(){
        return "access-denied";
    }
}
