package com.example.anashadfi_controle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AnashadfiControleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnashadfiControleApplication.class, args);
	}

}
