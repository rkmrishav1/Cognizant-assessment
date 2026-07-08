package com.sam.demoProj2Cong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoProj2CongApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoProj2CongApplication.class, args);// this return the runnning app context.
		//Dev b = new Dev();// when we dont use sping we do not create the obj spring will do it for me.
		Dev b = context.getBean(Dev.class);
		b.build();

	}
}
