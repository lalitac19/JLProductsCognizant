package com.demo.products.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.products.model.Products;
import com.demo.products.service.ProductServiceImpl;

@RestController
public class ProductsController {

	
	
	@RequestMapping("/products")
	public ResponseEntity<Object> testing() {
		RestTemplate getProducts = new RestTemplate();
		ResponseEntity<String> response = getProducts.getForEntity("https://jl-nonprod-syst.apigee.net/v1/categories/600001506/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma", String.class);
	//	Response myProducts = getProducts.getForObject("https://jl-nonprod-syst.apigee.net/v1/categories/600001506/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma", Response.class);
		return new ResponseEntity<>(response, HttpStatus.OK);
	} 

}
