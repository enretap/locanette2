package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.OrderReturn;

public interface OrderReturnRepository extends JpaRepository<OrderReturn, Long>{

}
