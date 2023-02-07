package com.example.jwthellospring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class controller {

    @GetMapping("/jwtget")
    public String getMessage()
    {
        return "hellow";
    }
}
