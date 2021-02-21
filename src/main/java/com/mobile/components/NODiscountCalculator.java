package com.mobile.components;

import java.math.BigDecimal;

import com.mobile.components.interfaces.DiscountCalculator;
import com.mobile.model.DiscountType;
import com.mobile.model.User;

public class NODiscountCalculator implements DiscountCalculator {

	@Override
	public BigDecimal calculateUserDiscount(BigDecimal invoiceAmount, double discountAmount, double DiscountIntervals,
			DiscountType discountType) {
		return BigDecimal.ZERO;
	}

	@Override
	public BigDecimal calculateBillDiscount(BigDecimal invoiceAmount, double discountAmount, double DiscountIntervals,
			DiscountType discountType) {
		return BigDecimal.ZERO;
	}

	@Override
	public boolean isApplicableForDiscount(User user) {
		return false;
	}

	@Override
	public BigDecimal calculategeniricDiscount(BigDecimal invoiceAmount, double discountAmount,
			double DiscountIntervals, DiscountType discountType) {
		return BigDecimal.ZERO;
	}



}
