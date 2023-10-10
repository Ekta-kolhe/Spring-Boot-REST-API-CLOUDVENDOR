package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//@ComponentScan:- spring ioc will scan all the classes which we created in the package 
@SpringBootApplication
public class DemoApplication  {

	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	
}
