package com.ecommerce.microcommerce.wsObject;

import com.ecommerce.microcommerce.model.Product;

public class ProductAdmin {
	
	private Product product;
	private int diff;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getDiff() {
		return diff;
	}
	public void setDiff(int diff) {
		this.diff = diff;
	}
	public ProductAdmin(Product product, int diff) {
		super();
		this.product = product;
		this.diff = diff;
	}
	
	
	

}
