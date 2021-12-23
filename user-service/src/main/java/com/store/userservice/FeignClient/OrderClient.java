package com.store.userservice.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "order-microservice")
public interface OrderClient {

    @GetMapping("/getOrders/{id}")
    Object getOrdersForCustomer(@PathVariable int id);
}