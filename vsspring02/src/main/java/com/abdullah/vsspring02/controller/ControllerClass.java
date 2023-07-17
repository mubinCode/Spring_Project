package com.abdullah.vsspring02.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

    @RequestMapping("/")
    public String view(){
        return "WOW! From VS Code";
    }
    
}
