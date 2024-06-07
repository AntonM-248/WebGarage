package com.techexpress.webgarage.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techexpress.webgarage.domain.Car;
import com.techexpress.webgarage.domain.CarRepository;

@RestController
public class CarController {
	@Autowired
	private CarRepository repository;
	
	@GetMapping("/cars")
	public Iterable<Car> getCars() {
		return repository.findAll();
	}
	
}
