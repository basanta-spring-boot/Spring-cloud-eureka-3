package com.basant.spring.ticket.consumer.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VendorRequest {

	private int vendorId;
	private String vendorName;
	private int tenure;

}
