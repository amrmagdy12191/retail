package com.mobile.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "serial_number")
	private String serialNumber;
	
	@Column(name = "price")
	private BigDecimal price;
	
	@ManyToMany(mappedBy = "products")
	private List<Store> stores;
	
	@ManyToMany(mappedBy = "products")
	private List<Orders> orders;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<Store> getStores() {
		return stores;
	}

	public void setStores(List<Store> stores) {
		this.stores = stores;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
	        return true;
	    if (!(o instanceof Product))
	        return false;
	    Product other = (Product)o;
	    if(this.id != 0 && this.id == other.id)
	    	return true;
	    else 
	    	return false;
	}
	
	@Override
	public int hashCode() {
		final int PRIME = 31;
	    int result = 1;
	    result = PRIME * result + getId();
	    return result;
	}

}
