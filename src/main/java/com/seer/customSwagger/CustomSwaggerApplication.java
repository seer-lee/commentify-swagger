package com.seer.customSwagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CustomSwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomSwaggerApplication.class, args);
	}

}
