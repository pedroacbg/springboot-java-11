package com.pedroanjos.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroanjos.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
