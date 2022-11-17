package com.demo.Basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {
		System.out.println("Basic Start Method");
		System.out.println("Basic Start Method in Yugal Branch");

		int a=4;
		int b=5;
		int c=a+b;
		System.out.println("Value of C = "+c);

		SpringApplication.run(BasicApplication.class, args);
	}

}
