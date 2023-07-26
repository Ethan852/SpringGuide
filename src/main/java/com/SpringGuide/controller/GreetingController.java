package com.SpringGuide.controller;

import com.SpringGuide.dao.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {


    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "World") String name){

        System.out.println("Hello Greeting");
        return new Greeting(1, name);
    }
}
