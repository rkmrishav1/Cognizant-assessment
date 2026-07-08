package com.sam.demoProj2Cong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class hello {
    @RequestMapping("/")
    public String sayHello(){
        return "Hello World";
    }
}

