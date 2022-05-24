package com.ecommerce.data.dto;

import com.ecommerce.data.model.Request;

public class RequestDTO {

	private String referenceRequest;
	private CustomerDTO customer;
	private ProductDTO procuct;
	
	public Request getEntity() {
		return new Request(referenceRequest, customer.getEntity(), procuct.getEntity());
	}

	public RequestDTO(String referenceRequest, CustomerDTO customer, ProductDTO procuct) {
		this.referenceRequest = referenceRequest;
		this.customer = customer;
		this.procuct = procuct;
	}

	public String getReferenceRequest() {
		return referenceRequest;
	}

	public void setReferenceRequest(String referenceRequest) {
		this.referenceRequest = referenceRequest;
	}

	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}

	public ProductDTO getProcuct() {
		return procuct;
	}

	public void setProcuct(ProductDTO procuct) {
		this.procuct = procuct;
	}
	
	
	
	

}
