package com.api.feedback.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FeedBackControllers {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    // Login form
    @GetMapping("/returnIndex")
    public String indexError(Model model) {
        model.addAttribute("loginError", true);
        return "index";
    }

    @GetMapping("/login-chief")
    public String loginChief() {
        return "loginchief";
    }

    @GetMapping("/login-employee")
    public String loginEmployee() {
        return "loginemployee";
    }

    

}
