package com.demo.products.model;

public class Products {
	private String productID;
	private String title;
	private String nowPrice;
	private ColorSwatch colorSwatch; 
	private String priceLabel; 
	
public Products() {}
	
	public Products(String prodID, String title, String nowPrice, String priceLabel) {
		this.setProductID(prodID);
		this.setTitle(title);
		this.setNowPrice(nowPrice);
		this.setPriceLabel(priceLabel); 
	}
	
	private void setNowPrice(String nowPrice) {
		this.nowPrice = nowPrice; 
	}

	private void setPriceLabel(String priceLabel) {
		this.priceLabel = priceLabel;
	}

	private void setTitle(String title) {
		this.title = title;
	}

	private void setProductID(String prodID) {
		this.productID = prodID;
	}

	public String getProductID() {
		return productID;
	}

	public String getTitle() {
		return title;
	}

	public String getNowPrice() {
		return nowPrice;
	}


	public String getPriceLabel() {
		return priceLabel;
	}

}
