package com.mobile.components;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.mobile.components.interfaces.DiscountCalculator;
import com.mobile.model.DiscountType;
import com.mobile.model.User;
import com.mobile.utils.CalculatorUtil;

@Component
public class CustomDiscountCalculator implements DiscountCalculator {

	@Override
	public BigDecimal calculateUserDiscount(BigDecimal invoiceAmount, double discountAmount, double discountIntervals,
			DiscountType discountType) {
		return CalculatorUtil.calculateDiscount(invoiceAmount, discountAmount, discountIntervals, discountType);
	}

	@Override
	public BigDecimal calculateBillDiscount(BigDecimal invoiceAmount, double discountAmount, double discountIntervals,
			DiscountType discountType) {
		return CalculatorUtil.calculateDiscount(invoiceAmount, discountAmount, discountIntervals, discountType);
	}

	@Override
	public boolean isApplicableForDiscount(User user) {
		return true;
	}

	@Override
	public BigDecimal calculategeniricDiscount(BigDecimal invoiceAmount, double discountAmount,
			double discountIntervals, DiscountType discountType) {
		return CalculatorUtil.calculateDiscount(invoiceAmount, discountAmount, discountIntervals, discountType);
	}



}
