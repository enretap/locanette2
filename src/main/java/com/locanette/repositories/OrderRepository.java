package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
