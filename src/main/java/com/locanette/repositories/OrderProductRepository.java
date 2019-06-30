package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.OrderProduct;

public interface OrderProductRepository extends JpaRepository<OrderProduct, Long>{

}
