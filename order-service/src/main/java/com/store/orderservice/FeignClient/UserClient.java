package com.store.orderservice.FeignClient;


import com.store.orderservice.Entity.User;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@FeignClient(name = "User", url = "http://localhost:8081/")
public interface UserClient {

	@GetMapping(value = "/users/{id}")
    public User getUserById(@PathVariable("id") Long id);
}
