package com.store.productservice.Controller;

import com.store.productservice.Entity.Product;
import com.store.productservice.Service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/admin")
public class AdminProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/saveproduct")
	private Product addProduct(@RequestBody Product product) {
		
		return productService.addProduct(product);

	}

	@DeleteMapping("/deleteproduct/{id}")
	private String deleteProduct(@PathVariable("id") Long id) {
		Product product = productService.getProductById(id);
	
		productService.deleteProduct(id);
		
        return "product deleted";
	}
}
