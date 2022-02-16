package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaDemoApplication {

	public static void main(String[] args) {
		System.out.print("hello");
		SpringApplication.run(KafkaDemoApplication.class, args);
	}

}
