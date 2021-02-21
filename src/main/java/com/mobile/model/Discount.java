package com.mobile.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "discount")
public class Discount {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="bill_interval")
	private int billInterval;
	
	@Column(name="bill_amount")
	private double billAmount;
	
	@Enumerated(EnumType.STRING)
	private DiscountType billDiscountType;
	
	@Column(name="custom_discount")
	private double customeDiscount;
	
	@Column(name="custom_discount_interval")
	private double customeDiscountInterval;
	
	@Enumerated(EnumType.STRING)
	private DiscountType customDiscountType;
	
	@Column(name="generic_discount")
	private double genericDiscount;
	
	@Column(name="generic_discount_interval")
	private double genericDiscountInterval;
	
	@Enumerated(EnumType.STRING)
	private DiscountType genericDiscountType;
	
	@OneToOne
    @JoinColumn(name = "applicable_user_type_id")
	@NotNull
	private UserType applicableUserType;
	
	@Column(name = "discount_calculator")
	@NotNull
	private String discountCalculator; 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBillInterval() {
		return billInterval;
	}

	public void setBillInterval(int billInterval) {
		this.billInterval = billInterval;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public DiscountType getBillDiscountType() {
		return billDiscountType;
	}

	public void setBillDiscountType(DiscountType billDiscountType) {
		this.billDiscountType = billDiscountType;
	}

	public double getCustomeDiscount() {
		return customeDiscount;
	}

	public void setCustomeDiscount(double customeDiscount) {
		this.customeDiscount = customeDiscount;
	}

	public double getCustomeDiscountInterval() {
		return customeDiscountInterval;
	}

	public void setCustomeDiscountInterval(double customeDiscountInterval) {
		this.customeDiscountInterval = customeDiscountInterval;
	}

	public DiscountType getCustomDiscountType() {
		return customDiscountType;
	}

	public void setCustomDiscountType(DiscountType customDiscountType) {
		this.customDiscountType = customDiscountType;
	}

	public UserType getApplicableUserType() {
		return applicableUserType;
	}

	public void setApplicableUserType(UserType applicableUserType) {
		this.applicableUserType = applicableUserType;
	}

	public String getDiscountCalculator() {
		return discountCalculator;
	}

	public void setDiscountCalculator(String discountCalculator) {
		this.discountCalculator = discountCalculator;
	}

	public double getGenericDiscount() {
		return genericDiscount;
	}

	public void setGenericDiscount(double genericDiscount) {
		this.genericDiscount = genericDiscount;
	}

	public double getGenericDiscountInterval() {
		return genericDiscountInterval;
	}

	public void setGenericDiscountInterval(double genericDiscountInterval) {
		this.genericDiscountInterval = genericDiscountInterval;
	}

	public DiscountType getGenericDiscountType() {
		return genericDiscountType;
	}

	public void setGenericDiscountType(DiscountType genericDiscountType) {
		this.genericDiscountType = genericDiscountType;
	}



}
