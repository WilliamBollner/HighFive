package com.ecommerce.data.dto;

import com.ecommerce.data.model.CustomerReview;

public class CustomerReviewDTO {

	private String referenceReview;
	private String modelingReview;
	private double waistReview;
	private double lengthReview;
	private String elasticity;
	private ProductDTO product;
	
	public CustomerReview getEntity() {
		return new CustomerReview(referenceReview, modelingReview, waistReview, lengthReview, elasticity, product.getEntity());
	}
	
	public CustomerReviewDTO(String referenceReview, String modelingReview, double waistReview, double lengthReview,
			String elasticity, ProductDTO product) {
		super();
		this.referenceReview = referenceReview;
		this.modelingReview = modelingReview;
		this.waistReview = waistReview;
		this.lengthReview = lengthReview;
		this.elasticity = elasticity;
		this.product = product;
	}
	
	public String getReferenceReview() {
		return referenceReview;
	}
	public void setReferenceReview(String referenceReview) {
		this.referenceReview = referenceReview;
	}
	public String getModelingReview() {
		return modelingReview;
	}
	public void setModelingReview(String modelingReview) {
		this.modelingReview = modelingReview;
	}
	public double getWaistReview() {
		return waistReview;
	}
	public void setWaistReview(double waistReview) {
		this.waistReview = waistReview;
	}
	public double getLengthReview() {
		return lengthReview;
	}
	public void setLengthReview(double lengthReview) {
		this.lengthReview = lengthReview;
	}
	public String getElasticity() {
		return elasticity;
	}
	public void setElasticity(String elasticity) {
		this.elasticity = elasticity;
	}
	public ProductDTO getProduct() {
		return product;
	}
	public void setProduct(ProductDTO product) {
		this.product = product;
	}
	
	
	

}
