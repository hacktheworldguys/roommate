package com.project.roommate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RoommateRestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello World!";
    }

}
