package org.example.spdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.hello:ooo}")
    private String testHello;

    @GetMapping("/hello")
    public String hello() {
        return "hello Moonya!!" + testHello;
    }

    @PostMapping("/hello/post")
    public String hellPost(String name) {
        return "hello " + name;
    }
}
