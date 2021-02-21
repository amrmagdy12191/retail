package com.mobile.components;

import java.math.BigDecimal;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.mobile.components.interfaces.DiscountCalculator;
import com.mobile.model.Discount;
import com.mobile.model.User;

@Component
public class DiscountProvider {
	
	private DiscountCalculator discountCalculator;
	
	@Autowired
	private ApplicationContext context;
	
	
	public BigDecimal calculateDiscount(BigDecimal invoiceAmount, User user) {
		BigDecimal validDiscount = BigDecimal.ZERO;
		if(user != null) {
			Discount discount = user.getUserType().getDiscount();
			Object discountProviderBean = null;
			
				try {
					discountProviderBean = context.getBean(Class.forName(discount.getDiscountCalculator()));
				} catch (Exception e) {
					System.out.println("Invalid Calculator");
				}
			
			
		
			
			if(discountProviderBean != null && discountProviderBean instanceof DiscountCalculator 
					&& discount != null) {
				discountCalculator = (DiscountCalculator)discountProviderBean;				
				BigDecimal billDiscount = discountCalculator.calculateBillDiscount(invoiceAmount, discount.getCustomeDiscount(),
						discount.getCustomeDiscountInterval(), discount.getCustomDiscountType());
				validDiscount = billDiscount;
				
				BigDecimal genericDiscount = discountCalculator.calculateBillDiscount(invoiceAmount, discount.getGenericDiscount(),
						discount.getGenericDiscountInterval(), discount.getGenericDiscountType());
				
				
				if(genericDiscount.compareTo(validDiscount) == 1) {
					validDiscount = genericDiscount;
				}
				
				if(discountCalculator.isApplicableForDiscount(user)) {
					BigDecimal userDiscount = discountCalculator.calculateUserDiscount(invoiceAmount, discount.getBillAmount(), discount.getBillInterval(), discount.getBillDiscountType());
					if(userDiscount.compareTo(validDiscount) == 1) {
						validDiscount =  userDiscount;
					}
				}

				
			}
		}
		
		return validDiscount;
	}

}
