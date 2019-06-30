package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.House;

public interface HouseRepository extends JpaRepository<House, Long>{

}
