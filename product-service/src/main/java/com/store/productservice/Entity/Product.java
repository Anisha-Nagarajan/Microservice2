package com.store.productservice.Entity;


import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Products")
// @JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String productName;
	private BigDecimal price;
	private String description;
	private String category;
    public Product(){

    }
    public Product(Long id, String productName, BigDecimal price, String description, String category) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.category = category;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return "Product [category=" + category + ", description=" + description + ", id=" + id + ", price=" + price
                + ", productName=" + productName + "]";
    }
    

}
