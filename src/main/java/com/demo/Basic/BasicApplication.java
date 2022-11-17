package com.demo.Basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		System.out.println("Basic Start Method");
		System.out.println("Basic Start Method in Yugal Branch");


		SpringApplication.run(BasicApplication.class, args);
	}

}
