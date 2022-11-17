package com.demo.Basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		System.out.println("Basic Start Method");
		SpringApplication.run(BasicApplication.class, args);
	}

}
