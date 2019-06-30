package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

}
