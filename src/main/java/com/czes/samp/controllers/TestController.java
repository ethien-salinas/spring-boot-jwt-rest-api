package com.czes.samp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.czes.samp.models.Person;

@RestController
public class TestController {

    @RequestMapping("/test")
    Person test(){
        return new Person("Ethien Salinas", 33);
    }

}