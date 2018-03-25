package com.basant.spring.ticket.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.basant.spring.ticket.consumer.beans.Acknowledgement;
import com.basant.spring.ticket.consumer.beans.VendorRequest;

@RestController
public class TicketClientController {
	@Autowired
	private RestTemplate template;


	@PostMapping("/getOffers")
	public Acknowledgement getBookingOffers(@RequestBody VendorRequest request) {
		Acknowledgement acknowledgement = template.postForObject("http://TICKET-PROVIDER/ticketService/getBookingOffer",
				request, Acknowledgement.class);
		return acknowledgement;
	}

	@GetMapping("/getMessage")
	public String getMessage() {
		return template.getForObject("http://TICKET-PROVIDER/ticketService/test", String.class);
	}

	@PostMapping("/getOffers1")
	public Acknowledgement getBookingOffers1(@RequestBody VendorRequest request) {
		Acknowledgement acknowledgement = template.postForObject("http://localhost:9090/ticketService/getBookingOffer",
				request, Acknowledgement.class);
		return acknowledgement;
	}
}
