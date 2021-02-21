package com.mobile.model;

import java.math.BigDecimal;
import java.security.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name =  "invoice", indexes = @Index(columnList = "bill_number"))
public class Invoice {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "bill_number", unique = true)
	private String billNumber;
	
	@Column(name= "items_count")
	private Integer ItemsCount;
	
	@Column(name = "bill_date")
	private Timestamp billDate;
	
	@Column(name = "bill_amount")
	private BigDecimal billAmount;
	
	@Column(name = "paid_amount")
	private BigDecimal paidAmount;
	
	@Column(name = "due_date")
	private Date dueDate;
	
	@OneToOne(mappedBy = "invoice")
	private Orders order;
	
	@Enumerated(EnumType.STRING)
	private InvoiceStatus invoiceStatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public Integer getItemsCount() {
		return ItemsCount;
	}

	public void setItemsCount(Integer itemsCount) {
		ItemsCount = itemsCount;
	}

	public Timestamp getBillDate() {
		return billDate;
	}

	public void setBillDate(Timestamp billDate) {
		this.billDate = billDate;
	}

	public BigDecimal getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
	}

	public BigDecimal getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(BigDecimal paidAmount) {
		this.paidAmount = paidAmount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public InvoiceStatus getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(InvoiceStatus invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	@Override
	public int hashCode() {
		final int PRIME = 31;
	    int result = 1;
	    result = PRIME * result + getId();
	    return result;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
	        return true;
	    if (!(o instanceof Invoice))
	        return false;
	    Invoice other = (Invoice)o;
	    if(this.id != 0 && this.id == other.id)
	    	return true;
	    else 
	    	return false;
	}
	
	

}
