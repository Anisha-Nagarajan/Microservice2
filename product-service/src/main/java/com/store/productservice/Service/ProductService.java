package com.store.productservice.Service;


import java.util.List;

import com.store.productservice.Entity.Product;

public interface ProductService {
	public List<Product> getAllProduct();

	public List<Product> getAllProductByCategory(String category);

	public Product getProductById(Long id);

	public List<Product> getAllProductsByName(String name);

	public Product addProduct(Product product);

	public void deleteProduct(Long productId);
}
