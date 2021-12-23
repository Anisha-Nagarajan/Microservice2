package com.store.orderservice.Repository;

import com.store.orderservice.Entity.Item;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{
  
}