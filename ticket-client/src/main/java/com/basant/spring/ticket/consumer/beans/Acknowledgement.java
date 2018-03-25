package com.basant.spring.ticket.consumer.beans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Acknowledgement {
	private int vendorId;
	private String offerStatus;
	private String info;
}
