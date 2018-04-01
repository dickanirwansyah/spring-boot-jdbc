package com.dicka.jdbc.springbootjdbc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dicka.jdbc.springbootjdbc.entitie.Product;
import com.dicka.jdbc.springbootjdbc.service.ProductService;

@RestController
@RequestMapping(value = "/api/product")
public class ControllerProduct {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> listProduct(){
		return Optional.ofNullable(productService.listProduct())
				.map(resultset -> new ResponseEntity<List<Product>>(resultset, HttpStatus.OK))
				.orElse(new ResponseEntity<List<Product>>(HttpStatus.BAD_REQUEST));
	}

}
