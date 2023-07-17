package com.abdullah.VSSpring01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

    @RequestMapping("/")
    public String view(){
        return "Hello World Changed";
    }
    
}
