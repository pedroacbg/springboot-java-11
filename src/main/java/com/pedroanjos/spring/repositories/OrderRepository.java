package com.pedroanjos.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroanjos.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
	
}
