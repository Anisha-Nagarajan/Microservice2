package com.store.order1service.Repository;

import java.util.Optional;

import com.store.order1service.Entity.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {


Order findById(int id);
    
}