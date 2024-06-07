package com.techexpress.webgarage;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techexpress.webgarage.domain.AppUser;
import com.techexpress.webgarage.domain.AppUserRepository;
import com.techexpress.webgarage.domain.Car;
import com.techexpress.webgarage.domain.CarRepository;
import com.techexpress.webgarage.domain.Owner;
import com.techexpress.webgarage.domain.OwnerRepository;

@SpringBootApplication
public class WebgarageApplication implements CommandLineRunner {
	@Autowired
	private CarRepository repository;
	
	@Autowired
	private OwnerRepository ownerRepository;
	
	@Autowired
	private AppUserRepository urepository;
	
	private static final Logger logger = LoggerFactory.getLogger(WebgarageApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(WebgarageApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner("John", "Johnson");
		Owner owner2 = new Owner("Mary", "Robinson");
		ownerRepository.saveAll(Arrays.asList(owner1, owner2));
		repository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2023, 59000, owner1));
		repository.save(new  Car("Nissan", "Leaf", "White", "SSJ-3002", 2020, 29000, owner2));
	    repository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2022, 39000, owner2));
	    
	    repository.showAllCarsWithOwners();
	    
	 // Username: user, password: user
	     urepository.save(new AppUser("user", "$2a$10$NVM0n8ElaRgg7zWO1CxUdei7vWoPg91Lz2aYavh9.f9q0e4bRadue","USER"));
	        
	        // Username: admin, password: admin
	     urepository.save(new AppUser("admin", "$2a$10$8cjz47bjbR4Mn8GMg9IZx.vyjhLXR/SKKMSZ9.mP9vpMu0ssKi8GW", "ADMIN"));
	}

}
 