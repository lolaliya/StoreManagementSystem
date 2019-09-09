package com.caps.sms.boot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.caps.sms.controller.SmsDealerController;

@SpringBootApplication
@ComponentScan(basePackages= {"com.caps"})
public class DealerBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DealerBootApplication.class, args);
		
	}

}
