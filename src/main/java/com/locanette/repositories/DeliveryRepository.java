package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long>{

}
