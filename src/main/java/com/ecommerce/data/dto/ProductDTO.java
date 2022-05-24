package com.ecommerce.data.dto;

import com.ecommerce.data.model.Product;

public class ProductDTO {

	private double lengthProduct;
	private double waistProduct;
	private String sizeProduct;
	private double calculatedfit;
	private double comunityFit;
	
	
	public Product getEntity() {
		return new Product(lengthProduct, waistProduct, sizeProduct, calculatedfit, comunityFit);
	}
	
	
	
	public ProductDTO(double lengthProduct, double waistProduct, String sizeProduct, double calculatedfit,
			double comunityFit) {
		this.lengthProduct = lengthProduct;
		this.waistProduct = waistProduct;
		this.sizeProduct = sizeProduct;
		this.calculatedfit = calculatedfit;
		this.comunityFit = comunityFit;
	}



	public double getLengthProduct() {
		return lengthProduct;
	}
	public void setLengthProduct(double lengthProduct) {
		this.lengthProduct = lengthProduct;
	}
	public double getWaistProduct() {
		return waistProduct;
	}
	public void setWaistProduct(double waistProduct) {
		this.waistProduct = waistProduct;
	}
	public String getSizeProduct() {
		return sizeProduct;
	}
	public void setSizeProduct(String sizeProduct) {
		this.sizeProduct = sizeProduct;
	}
	public double getComunityFit() {
		return comunityFit;
	}
	public void setComunityFit(double comunityFit) {
		this.comunityFit = comunityFit;
	}
	

}
