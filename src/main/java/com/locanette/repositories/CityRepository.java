package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.City;

public interface CityRepository extends JpaRepository<City, Long>{

}
