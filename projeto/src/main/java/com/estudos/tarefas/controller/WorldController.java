package com.estudos.tarefas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")

public class WorldController {

    @GetMapping
    public String helloWorld() {
        return "Hello World";
    }
}
