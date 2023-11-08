package com.qmino.springbootjenkins.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value = "/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.status(200).body("test!");
    }
}
