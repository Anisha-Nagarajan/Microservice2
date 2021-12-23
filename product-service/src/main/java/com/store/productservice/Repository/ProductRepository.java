package com.store.productservice.Repository;

import java.util.List;

import com.store.productservice.Entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	public List<Product> findAllByCategory(String category);
    public List<Product> findAllByProductName(String name);
}
