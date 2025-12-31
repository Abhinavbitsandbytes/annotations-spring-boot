package com.example.abhinav.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping
//    @ResponseBody
    public String homePage() {
        return "home";
    }

    // here we are sending just a string "home" which is throwing error as there is no view resolver configured
    // to resolve this error we need to configure a view resolver in our application context but thats beyond the scope of this example
    // so for now just understand that this is how we map a controller to a view using annotations


    // without using @ResponseBody, in localhost:8080/page we will get an error like below:
//    Whitelabel Error Page
//    This application has no explicit mapping for /error, so you are seeing this as a fallback.
//
//    Wed Dec 31 16:29:25 IST 2025
//    There was an unexpected error (type=Not Found, status=404).

    // with @ResponseBody, in localhost:8080/page we will see the string "home" displayed in the browser
}
