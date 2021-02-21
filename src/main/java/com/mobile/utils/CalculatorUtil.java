package com.mobile.utils;

import java.math.BigDecimal;

import com.mobile.model.DiscountType;


public class CalculatorUtil {
	
	public static final BigDecimal ONE_HUNDRED = new BigDecimal(100);
	
	public static BigDecimal calculatePercentageDiscount(BigDecimal invoiceAmount, double discountPercent) {
		BigDecimal discountValue = BigDecimal.ZERO;
		System.out.println(" invoiceAmount : " +  invoiceAmount + ", discountPercent : " + discountPercent);
		BigDecimal discountPercentBigDecimal = new BigDecimal(discountPercent);
		discountValue = invoiceAmount.multiply(discountPercentBigDecimal).divide(ONE_HUNDRED);		
		return discountValue;
	}	
	
	public static BigDecimal calculateIntervalPercentageDiscount(BigDecimal invoiceAmount, double discountPercent
			, double interval) {
		BigDecimal discountValue = BigDecimal.ZERO;
		BigDecimal discountPercentBigDecimal = new BigDecimal(discountPercent);
		BigDecimal intervaltBigDecimal = new BigDecimal(interval);
		BigDecimal intInvoiceAmount = new BigDecimal(invoiceAmount.divide(intervaltBigDecimal).intValue()).multiply(intervaltBigDecimal);
		discountValue = intInvoiceAmount.multiply(discountPercentBigDecimal).divide(ONE_HUNDRED);		
		return discountValue;
	}
	
	public static BigDecimal calculateDiscount(BigDecimal invoiceAmount, double discountAmount, double discountIntervals,
			DiscountType discountType) {
		BigDecimal discountValue = BigDecimal.ZERO;
		System.out.println("=====> calculateDiscount : ");
		if(DiscountType.PERCENTAGE.equals(discountType)) {
			System.out.println("PERCENTAGE");
			if(discountIntervals != 0) {
				discountValue = calculateIntervalPercentageDiscount(invoiceAmount, discountAmount, discountIntervals);
			}else {
				discountValue = calculatePercentageDiscount(invoiceAmount, discountAmount);
			}			
		}else {
			discountValue = new BigDecimal(discountAmount);
		}
		
		return discountValue;
	}

}
