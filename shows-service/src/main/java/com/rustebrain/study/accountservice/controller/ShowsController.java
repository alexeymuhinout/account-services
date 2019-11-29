package com.rustebrain.study.accountservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ShowsController {

    @Value("${show-service.yml.spring.data.mongodb.database}")
    private String prop;

    @GetMapping("/hello")
    public void helloWorld(){
        System.out.println(prop);
    }

}
