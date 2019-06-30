package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.OrderProcessing;

public interface OrderProcessingRepository extends JpaRepository<OrderProcessing, Long>{

}
