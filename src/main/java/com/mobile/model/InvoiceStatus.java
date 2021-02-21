package com.mobile.model;

public enum InvoiceStatus {
	PAID("Paid"), NOT_PAID("Not Paid"), PARIIALLY_PAID("Partially Paid");
	
	private String name;
	private InvoiceStatus(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
}
