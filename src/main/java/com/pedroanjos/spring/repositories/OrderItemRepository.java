package com.pedroanjos.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroanjos.spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
	
}
