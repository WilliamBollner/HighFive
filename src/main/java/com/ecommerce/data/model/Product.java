package com.ecommerce.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ecommerce.data.dto.ProductDTO;



@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "LENGTH")
	private double length;
	@Column(name = "WAIST")
	private double waist;
	@Column(name = "SIZE")
	private String size;
	@Column(name = "CALCULATED_FIT")
	private double calculatedfit;
	@Column(name = "COMUNITY_FIT")
	private double comunityFit;
	
	ProductDTO getDTO() {
		return new ProductDTO(length, waist, size, calculatedfit, comunityFit);
	}
	
	public Product(double length, double waist, String size, double calculatedfit, double comunityFit) {
		this.length = length;
		this.waist = waist;
		this.size = size;
		this.calculatedfit = calculatedfit;
		this.comunityFit = comunityFit;
	}
	
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWaist() {
		return waist;
	}
	public void setWaist(double waist) {
		this.waist = waist;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getComunityFit() {
		return comunityFit;
	}
	public void setComunityFit(double comunityFit) {
		this.comunityFit = comunityFit;
	}

	

}
