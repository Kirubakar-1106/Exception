package com.onesofts.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onesofts.products.entity.Products;
import com.onesofts.products.services.ProductsServices;

@RestController
@RequestMapping(value = "/productsdetails")
public class ProductsController {
	@Autowired
	ProductsServices productsservice;

	@PostMapping(value = "/addproductstolist")
	public String insertproducts(@RequestBody List<Products> p) {
		return productsservice.insertproducts(p);
	}
	
	@GetMapping(value = "/getproductsbylist")
	public List<Products> getproductslist(){
		return productsservice.getproductslist();
	}

}
