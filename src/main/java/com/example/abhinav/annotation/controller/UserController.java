package com.example.abhinav.annotation.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
// option 1
//    @RequestMapping("/get")
//    public String getUser(){
//        return "all users";
//    }
// by default, RequestMapping set to get method

    // option 2
//    @RequestMapping(value = "/get", method = RequestMethod.GET)
//    public String getUser(){
//        return "all users";
//    }
//}

// combined both options
    @GetMapping("/get")
    public String getUsers(){
        return "all users";
    }

    // similarly we have @PostMapping, @PutMapping, @DeleteMapping
    @PostMapping("/post")
    public String postUsers(){
        return "all users";
    }

    @PutMapping("/put")
    public String putUsers() {
        return "all users";
    }
}
