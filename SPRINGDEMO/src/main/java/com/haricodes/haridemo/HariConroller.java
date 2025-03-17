package com.haricodes.haridemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HariConroller {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World !!!";
    }
}
