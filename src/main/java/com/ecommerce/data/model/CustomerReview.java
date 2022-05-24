package com.ecommerce.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ecommerce.data.dto.CustomerReviewDTO;

@Entity
public class CustomerReview {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column (name = "REF_REVIEW")
	private String reference;
	@Column (name = "MODELING")
	private String modeling;
	@Column (name = "WAIST")
	private double waist;
	@Column (name = "LENGTH")
	private double length;
	@Column (name = "ELASTICITY")
	private String elasticity;
	@ManyToOne
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;	
	
	public CustomerReviewDTO getDTO() {
		return new CustomerReviewDTO(reference, modeling, waist, length, elasticity, product.getDTO());
	}
	
	public CustomerReview(String reference, String modeling, double waist, double length, String elasticity,
			Product product) {
		this.reference = reference;
		this.modeling = modeling;
		this.waist = waist;
		this.length = length;
		this.elasticity = elasticity;
		this.product = product;
	}
	
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getModeling() {
		return modeling;
	}
	public void setModeling(String modeling) {
		this.modeling = modeling;
	}
	public double getWaist() {
		return waist;
	}
	public void setWaist(double waist) {
		this.waist = waist;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getElasticity() {
		return elasticity;
	}
	public void setElasticity(String elasticity) {
		this.elasticity = elasticity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}

	
	
}
