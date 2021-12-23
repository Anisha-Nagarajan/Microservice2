package com.store.productservice.Controller;

import java.util.List;

import com.store.productservice.Entity.Product;
import com.store.productservice.Service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/prod")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		List<Product> products = productService.getAllProduct();
		// if (!products.isEmpty()) {
		// 	return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
		// }
		// return new ResponseEntity<List<Product>>(HttpStatus.NOT_FOUND);
        return products;
	}

    @GetMapping("/productsbycategory/{category}")
	public List<Product> getAllProductByCategory(@PathVariable("category") String category) {
		List<Product> products = productService.getAllProductByCategory(category);

        return products;
	}

	

	@GetMapping("/productbyid/{id}")
	public Product getProductById(@PathVariable("id") long id) {
		Product product = productService.getProductById(id);
	
        return product;
	}

	@GetMapping("/productsbyname/{name}")
	public List<Product> getAllProductsByName(@PathVariable("name") String name) {
		List<Product> products = productService.getAllProductsByName(name);
	
        return products;
	}

	
}
