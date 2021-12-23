package com.store.order1service.Service;


import java.util.List;

import com.store.order1service.Entity.Order;
import com.store.order1service.Repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
@Autowired  
OrderRepository repository;  


public Order saveOrder(Order order) {
    return repository.save(order);
}



public List<Order> getOrders() {
    return repository.findAll();
}

public Order getOrderById(int id) {
    return repository.findById(id);
}


public String deleteOrder(int id) {
    repository.deleteById(id);
    return "order removed !! " + id;
}

public Order updateOrder(Order order) {
    Order existingProduct =repository.findById(order.getId());
    existingProduct.setStatus(order.getStatus());
    existingProduct.setTotal(order.getTotal());
    existingProduct.setUserid(order.getUserid());
    return repository.save(existingProduct);
}
}