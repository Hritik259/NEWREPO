package com.example.springbootdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringbootDockerDemoApplication {
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Spring boot docker demo";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerDemoApplication.class, args);
	}

}
