package com.dicka.jdbc.springbootjdbc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

	@GetMapping(value = "/{idproduct}")
	public ResponseEntity<Product> getIdproduct(@PathVariable String idproduct){
		return Optional.ofNullable(productService.getIdproduct(Integer.parseInt(idproduct)))
				.map(resultset -> new ResponseEntity<>(resultset, HttpStatus.OK))
				.orElse(new ResponseEntity<Product>(HttpStatus.BAD_REQUEST));
	}

	@PostMapping(value = "/created")
	public ResponseEntity<Product> createdProduct(@RequestBody Product product){
		return Optional.ofNullable(productService.createdProduct(product))
				.map(resultset -> new ResponseEntity<>(resultset, HttpStatus.CREATED))
				.orElse(new ResponseEntity<Product>(HttpStatus.BAD_REQUEST));
	}

	@PostMapping(value = "/updated")
	public ResponseEntity<Product> updatedProduct(@RequestBody Product product){
		return Optional.ofNullable(productService.updateProduct(product))
				.map(resultset -> new ResponseEntity<>(resultset, HttpStatus.OK))
				.orElse(new ResponseEntity<Product>(HttpStatus.BAD_REQUEST));
	}

}
