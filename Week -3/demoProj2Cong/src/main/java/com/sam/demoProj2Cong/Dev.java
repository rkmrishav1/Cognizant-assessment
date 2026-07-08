package com.sam.demoProj2Cong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired // field injection
    @Qualifier("desktop")
    private Computer comp; // autowire goes/search by type (Computer)


//    public void setLaptop(Laptop laptop) { // setter injection
//        this.laptop = laptop;
//    }

//    @Autowired // optional
//    public Dev(Laptop laptop) { // Constructor Injection
//        this.laptop = laptop;
//    }
    public void build(){
        comp.compile();
        System.out.println("Working on Project");
    }
}
