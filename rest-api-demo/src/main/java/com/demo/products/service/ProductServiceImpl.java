package com.demo.products.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.products.model.Prices;
import com.demo.products.model.Products;

public class ProductServiceImpl implements ProductService {
	
	@Autowired
	Products product;
	
	@Autowired
	Prices priceLabel;
	
	ArrayList<Products> products = new ArrayList<Products>();
/*
	@Override
	public List<Product> getDiscountedProducts() {
		List <Product> discountedProducts = new ArrayList <Product>();
		
		double priceReduction; 
		for(int x = 0; x <= discountedProducts.size(); x++) {
			if (discountedProducts.) {
				discountedProducts.add(arg0);
			}
		}
		return Collections.sort(product.));
	}

*/

	public List<Products> getDiscountedProducts() {
		// TODO Auto-generated method stub
		return null;
	}



}
