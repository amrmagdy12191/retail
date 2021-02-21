package com.mobile.components;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

import org.springframework.stereotype.Component;

import com.mobile.components.interfaces.DiscountCalculator;
import com.mobile.model.DiscountType;
import com.mobile.model.User;
import com.mobile.utils.CalculatorUtil;

@Component
public class UserDiscountCalculator implements DiscountCalculator {

	@Override
	public BigDecimal calculateUserDiscount(BigDecimal invoiceAmount, double discountAmount, double discountIntervals,
			DiscountType discountType) {
		System.out.println("=====> UserDiscountCalculator");
		return CalculatorUtil.calculateDiscount(invoiceAmount, discountAmount, discountIntervals, discountType);
	}

	@Override
	public BigDecimal calculateBillDiscount(BigDecimal invoiceAmount, double discountAmount, double discountIntervals,
			DiscountType discountType) {
		System.out.println("=====> calculateBillDiscount");
		return CalculatorUtil.calculateDiscount(invoiceAmount, discountAmount, discountIntervals, discountType);
	}

	@Override
	public boolean isApplicableForDiscount(User user) {
		LocalDate now = LocalDate.now();		
		LocalDate joiningDate = user.getJoinDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();			
		Period period = Period.between(joiningDate, now) ;
		int joiningYears = period.getYears();
		System.out.println("=====> isApplicableForDiscount :: joiningYears :" + joiningYears);
		if(joiningYears >=2)
			return true;
		
		return false;
	}

	@Override
	public BigDecimal calculategeniricDiscount(BigDecimal invoiceAmount, double discountAmount,
			double discountIntervals, DiscountType discountType) {
		return CalculatorUtil.calculateDiscount(invoiceAmount, discountAmount, discountIntervals, discountType);
	}

	

}
