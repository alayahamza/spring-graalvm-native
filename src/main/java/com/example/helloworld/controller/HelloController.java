package com.example.helloworld.controller;

import com.example.helloworld.payload.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public Hello hello() {
        return Hello.builder().value("Hello world !").build();
    }
}
