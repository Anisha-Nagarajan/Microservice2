package com.store.order1service.Controller;

import java.util.List;
import java.util.stream.Collectors;

import com.store.order1service.Entity.Order;
import com.store.order1service.Service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ord")
public class OrderController {
    @Autowired
    OrderService service;

    @PostMapping("/saveOrder")
    public Order addProduct(@RequestBody Order order) {
        return service.saveOrder(order);
    }
    @PutMapping("/editOrder/{id}")
    public Order updateProduct(@RequestBody Order order) {
        return service.updateOrder(order);
    }
    @DeleteMapping("/deleteOrder/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteOrder(id);
    }
    @GetMapping("/getOrders")
    public List<Order> findAllProducts() {
        return service.getOrders();
    }
    @GetMapping("/getOrders/{id}")
    public List<Order> getAllOrders(@PathVariable Integer id) {
   // if (customerId != null) {
       List<Order> orders = service.getOrders();
        return orders.stream()
                     .filter(order -> id.equals(order.getUserid()))
                     .collect(Collectors.toList());
   // }

  //  return orders;
}

    @GetMapping("/getOrder/{id}")
    public Order findProductById(@PathVariable int id) {
        return service.getOrderById(id);
    }
}