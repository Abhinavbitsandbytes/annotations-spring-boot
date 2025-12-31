package com.example.abhinav.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping
    public String homePage() {
        return "home";
    }

    // here we are sending just a string "home" which is throwing error as there is no view resolver configured
    // to resolve this error we need to configure a view resolver in our application context but thats beyond the scope of this example
    // so for now just understand that this is how we map a controller to a view using annotations
    
}
