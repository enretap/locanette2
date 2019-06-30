package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.OrderHistorical;

public interface OrderHistoricalRepository extends JpaRepository<OrderHistorical, Long>{

}
