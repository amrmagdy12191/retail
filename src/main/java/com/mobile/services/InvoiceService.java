package com.mobile.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.components.DiscountProvider;
import com.mobile.model.Discount;
import com.mobile.model.Invoice;
import com.mobile.model.User;
import com.mobile.repositories.InvoiceRepository;

@Service
public class InvoiceService {
	
	@Autowired
	private InvoiceRepository invoiceRepository;
	
	@Autowired
	private DiscountProvider discountProvider;
	
	public BigDecimal calculateDiscount(String billNumber){
		List<Invoice> invoicesResult = invoiceRepository.findByBillNumber(billNumber);
		BigDecimal discount = BigDecimal.ZERO;
		if(invoicesResult != null && !invoicesResult.isEmpty()) {
			User user = invoicesResult.get(0).getOrder().getUser();
			discount = 	discountProvider.calculateDiscount(invoicesResult.get(0).getBillAmount(), user);
		}
		
		return discount;
	}

}
