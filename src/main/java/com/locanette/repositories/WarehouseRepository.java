package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.Warehouse;

public interface WarehouseRepository extends JpaRepository<Warehouse, Long>{
	
}
