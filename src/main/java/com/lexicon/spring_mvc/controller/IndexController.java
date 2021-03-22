package com.lexicon.spring_mvc.controller;

import org.dom4j.rule.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {


    @GetMapping("/")
    public String home(Model model){
        String home = "Welcome to Home";
       model.addAttribute("home",home);
        return "home";
    }

    @GetMapping("/index")
    public String goToIndexPage(Model model){
        String index = "Welcome to index";
        model.addAttribute("index",index);
        return "index" ;
    }


}
