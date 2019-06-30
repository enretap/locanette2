package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.VehicleType;

public interface VehicleTypeRepository extends JpaRepository<VehicleType, Long>{

}
