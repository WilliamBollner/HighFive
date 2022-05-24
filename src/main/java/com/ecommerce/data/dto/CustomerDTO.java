package com.ecommerce.data.dto;

import com.ecommerce.data.model.Customer;

public class CustomerDTO {

	private String nameCustomer;
	private int heightCustomer;
	private double weightCustomer;
	
	public Customer getEntity() {
		return new Customer(nameCustomer, heightCustomer, weightCustomer);
	}
	
	public CustomerDTO(String nameCustomer, int heightCustomer, double weightCustomer) {
		this.nameCustomer = nameCustomer;
		this.heightCustomer = heightCustomer;
		this.weightCustomer = weightCustomer;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public int getHeightCustomer() {
		return heightCustomer;
	}

	public void setHeightCustomer(int heightCustomer) {
		this.heightCustomer = heightCustomer;
	}

	public double getWeightCustomer() {
		return weightCustomer;
	}

	public void setWeightCustomer(double weightCustomer) {
		this.weightCustomer = weightCustomer;
	}
	
	
	

}
