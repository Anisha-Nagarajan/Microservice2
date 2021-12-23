package com.store.order1service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
public class Order1ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Order1ServiceApplication.class, args);
	}

}
