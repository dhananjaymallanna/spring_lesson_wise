package com.uncoding.lesson1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class LessonContoller {
    @ResponseBody
    @GetMapping("/")
    public String hello(){
        return "Hello Buddy!!!";
    }

    @ResponseBody
    @PostMapping("/")
    public String posty(@RequestBody String input){

        return "Hello "+input+" !!!";
    }

}
