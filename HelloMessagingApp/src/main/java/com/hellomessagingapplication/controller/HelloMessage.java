package com.hellomessagingapplication.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloMessage {
    @GetMapping("/get")
    public String getHello() {
        return "Hello from BridgeLabz (GET)";
    }

    @PostMapping("/post")
    public String postHello() {
        return "Hello from BridgeLabz (POST)";
    }

    @PutMapping("/put")
    public String putHello() {
        return "Hello from BridgeLabz (PUT)";
    }

    @DeleteMapping("/delete")
    public String deleteHello() {
        return "Hello from BridgeLabz (DELETE)";
    }
}
