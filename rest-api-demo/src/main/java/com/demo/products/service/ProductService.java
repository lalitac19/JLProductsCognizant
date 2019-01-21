package com.demo.products.service;

import java.util.List;

import com.demo.products.model.Products;

public interface ProductService {
	List<Products> getDiscountedProducts();
}