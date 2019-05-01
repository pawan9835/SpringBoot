package com.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
@ComponentScan("com.boot")
@SpringBootApplication
public class Sprgboot001Application {

	public static void main(String[] args) {
		SpringApplication.run(Sprgboot001Application.class, args);
	}

}
