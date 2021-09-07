package com.pedroanjos.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroanjos.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
	
}
