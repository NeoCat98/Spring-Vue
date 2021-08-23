package com.example.fullstackexample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class messageController {
    
    @GetMapping("/hello")
    public String message(){
        return "hello world";
    }
}
