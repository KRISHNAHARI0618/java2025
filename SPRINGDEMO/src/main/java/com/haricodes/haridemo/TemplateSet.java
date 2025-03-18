package com.haricodes.haridemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TemplateSet {

    @GetMapping("/")
    public String Chiyya(){
        return "Hari.html";
    }

    @GetMapping("/workout")
    public String GetDailyWorkout(){
        return "This is Workout Session";
    }

    @GetMapping("/add")
    public String addition(){
        return "a + b";
    }

}
