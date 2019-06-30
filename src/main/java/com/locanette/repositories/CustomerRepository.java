package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
