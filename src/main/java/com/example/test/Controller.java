package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;


public class Controller {

    @GetMapping("/show")
    public String show(){
        return "pList";
    }
}


//test1