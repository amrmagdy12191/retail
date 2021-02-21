package com.mobile.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "grocery")
public class Grocery extends Customer {
	@Column(name = "category")
	private String category;
	
	@Column(name= "branches_count")
	private Integer branchesCount;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getBranchesCount() {
		return branchesCount;
	}

	public void setBranchesCount(Integer branchesCount) {
		this.branchesCount = branchesCount;
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
	    if (!(o instanceof Grocery))
	        return false;
	    Grocery other = (Grocery)o;
	    if(this.id != 0 && this.id == other.id)
	    	return true;
	    else 
	    	return false;
	}
	
	

}
