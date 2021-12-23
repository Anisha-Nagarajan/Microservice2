package com.store.orderservice.Utility;

import java.math.BigDecimal;

import com.store.orderservice.Entity.Product;

public class CartUtilities {
    public static BigDecimal getSubTotalForItem(Product product, int quantity){
        return (product.getPrice()).multiply(BigDecimal.valueOf(quantity));
     }
}
