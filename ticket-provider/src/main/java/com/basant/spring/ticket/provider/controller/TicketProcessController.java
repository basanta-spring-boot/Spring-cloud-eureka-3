package com.basant.spring.ticket.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basant.spring.ticket.provider.beans.Acknowledgement;
import com.basant.spring.ticket.provider.beans.VendorRequest;

@RestController
@RequestMapping("/ticketService")
public class TicketProcessController {

	@PostMapping("/getBookingOffer")
	public Acknowledgement getBookingOffer(@RequestBody VendorRequest request) {
		Acknowledgement acknowledgement = new Acknowledgement();
		String vendorName = request.getVendorName().toUpperCase();
		switch (vendorName) {
		case "HDFC":
			acknowledgement.setVendorId(request.getVendorId());
			acknowledgement.setOfferStatus("Current offer for " + vendorName + " user is 20% off on basic");
			acknowledgement.setInfo("percent Amount can be varry based on your billing amount");
			break;

		case "SBI":
			acknowledgement.setVendorId(request.getVendorId());
			acknowledgement.setOfferStatus("Current offer for " + vendorName + " user is 22% off on basic");
			acknowledgement.setInfo("percent Amount can be varry based on your billing amount");
			break;
		default:
			acknowledgement.setVendorId(request.getVendorId());
			acknowledgement.setOfferStatus("Current offer for " + vendorName + " user is 12% off on basic");
			acknowledgement.setInfo("percent Amount is constant for non registered user");
			break;
		}
		return acknowledgement;
	}

	@GetMapping("/test")
	public String getMessage(){
		return "Testing message";
	}
}
