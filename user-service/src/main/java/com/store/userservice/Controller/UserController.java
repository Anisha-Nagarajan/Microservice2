package com.store.userservice.Controller;

import java.util.List;


import com.store.userservice.Entity.User;
import com.store.userservice.FeignClient.OrderClient;
import com.store.userservice.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userservice;
    
	private OrderClient orderClient;

    public UserController(OrderClient orderClient) {
        this.orderClient = orderClient;
    }
	

	@GetMapping("/users")
	public List<User> getAllUser() {
		List<User> users = userservice.getAllUsers();
		// if (!users.isEmpty()) {
		// 	return new ResponseEntity<List<User>>(users, HttpStatus.OK);
		// }
		// return new ResponseEntity<List<User>>(HttpStatus.NOT_FOUND);
        return users;
	}

    @GetMapping("/getuser/{id}")
    public User findUserById(@PathVariable long id) {
        return userservice.getUserById(id);
    }
	
	
 
	@PostMapping("/saveuser")
	public User addUser(@RequestBody User user) {
		
		User user1 = userservice.saveUser(user);
        return user1;
	}
	
    @GetMapping("/user/{name}")
    public User findByUserName(@PathVariable String name){
        User user = userservice.findByUsername(name);
        return user;
    }

	@GetMapping("/getOrders/{id}")
    public Object getOrdersForCustomer(@PathVariable int id) {
        return orderClient.getOrdersForCustomer(id);
    }
	

}