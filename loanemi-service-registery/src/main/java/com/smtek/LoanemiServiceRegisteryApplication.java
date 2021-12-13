package com.smtek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LoanemiServiceRegisteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoanemiServiceRegisteryApplication.class, args);
	}

}
