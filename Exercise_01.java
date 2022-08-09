package com.example.hwday03;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercise_01 {
    @GetMapping("/hey")
    public String hi() {
        return "hi from name";
    }
    @GetMapping("/bye")
    public String bye() {
        return "Bye";
    }
    @GetMapping("/check/status")
    public String check() {
        return "Everything OK";
    }

    @GetMapping("/health")
    public String health() {
        return "Server health is up and running";
    }

}