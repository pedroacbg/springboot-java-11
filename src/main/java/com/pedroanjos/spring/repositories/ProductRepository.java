package com.pedroanjos.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroanjos.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
	
}
