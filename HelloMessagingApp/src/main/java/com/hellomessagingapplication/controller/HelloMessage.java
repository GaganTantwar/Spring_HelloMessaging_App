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
    @GetMapping("/query")
    public String sayHelloWithName(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @GetMapping("/param/{name}")
    public String sayHelloWithPathVariable(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @PostMapping("/post")
    public String sayHelloWithPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }
}
