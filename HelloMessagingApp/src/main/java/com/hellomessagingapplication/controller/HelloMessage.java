package com.hellomessagingapplication.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloMessage {
    @GetMapping("/get")
    public String getHello() {
        return "Hello from BridgeLabz (GET)";
    }
    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
