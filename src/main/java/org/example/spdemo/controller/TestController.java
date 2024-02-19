package org.example.spdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/hello")
    public String hello() {
        return "hello Moonya!!";
    }

    @PostMapping("/hello/post")
    public String hellPost(String name) {
        return "hello " + name;
    }
}
