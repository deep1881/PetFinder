package com.example.demo.Repo;

import org.springframework.data.repository.CrudRepository;


import com.example.demo.model.adoptedDog;

public interface adoptedRepo  extends CrudRepository<adoptedDog, Integer> {

	
	
	
}
