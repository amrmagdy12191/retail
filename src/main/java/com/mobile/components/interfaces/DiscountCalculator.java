package com.mobile.components.interfaces;

import java.math.BigDecimal;

import com.mobile.model.DiscountType;
import com.mobile.model.User;

public interface DiscountCalculator {
	
	public BigDecimal calculateUserDiscount(BigDecimal invoiceAmount, double discountAmount, double discountIntervals, DiscountType discountType);
	public BigDecimal calculateBillDiscount(BigDecimal invoiceAmount, double discountAmount, double discountIntervals, DiscountType discountType);
	public boolean isApplicableForDiscount(User user);
	public BigDecimal calculategeniricDiscount(BigDecimal invoiceAmount, double discountAmount, double discountIntervals, DiscountType discountType);
	
	
}
