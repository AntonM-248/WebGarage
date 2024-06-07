package com.techexpress.webgarage.domain;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long>{
	Optional<Owner> findByFirstname(String firstName);
}