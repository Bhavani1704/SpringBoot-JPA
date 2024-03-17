package com.bhavani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.bhavani")
public class SpringbootJPARepository {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJPARepository.class, args);
	}

}
