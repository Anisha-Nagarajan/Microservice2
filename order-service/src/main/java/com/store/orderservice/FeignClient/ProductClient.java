package com.store.orderservice.FeignClient;

import com.store.orderservice.Entity.Product;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "ProductCatalog", url = "http://localhost:8082/")
public interface ProductClient {

	@GetMapping(value = "/products/{id}")
    public Product getProductById(@PathVariable(value = "id") Long productId);

}