package com.haricodes.haridemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlerset{

    @GetMapping("/page")
    public String world(){
        return "Welcome To Spring Boot Lectures !!!";
    }
}
