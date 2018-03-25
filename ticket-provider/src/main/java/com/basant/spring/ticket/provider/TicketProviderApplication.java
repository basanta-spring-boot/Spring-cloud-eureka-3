package com.basant.spring.ticket.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TicketProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketProviderApplication.class, args);
	}
}
