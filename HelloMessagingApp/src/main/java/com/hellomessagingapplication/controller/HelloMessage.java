package com.hellomessagingapplication.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloMessage {
    @GetMapping("/get")
    public String getHello() {
        return "Hello from BridgeLabz (GET)";
    }

}
