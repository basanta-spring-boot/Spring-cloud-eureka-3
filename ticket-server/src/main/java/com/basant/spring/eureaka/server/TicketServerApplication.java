package com.basant.spring.eureaka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TicketServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketServerApplication.class, args);
	}
}
