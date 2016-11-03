package com.hellospringdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ravuthz on 2016-11-03.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }
}
