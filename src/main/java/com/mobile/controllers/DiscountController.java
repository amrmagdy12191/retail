package com.mobile.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.components.DiscountProvider;
import com.mobile.services.InvoiceService;

@RestController
@RequestMapping(path = "/discount")
public class DiscountController {
	
	@Autowired
	DiscountProvider discountProvider;
	
	@Autowired
	InvoiceService invoiceService;
	
	@GetMapping("/user")
	@ResponseBody
	public BigDecimal calculateDiscount(@RequestParam String billNumber) {
		return invoiceService.calculateDiscount(billNumber);
	}

}
