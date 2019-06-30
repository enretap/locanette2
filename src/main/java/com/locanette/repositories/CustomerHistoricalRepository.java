package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.CustomerHistorical;

public interface CustomerHistoricalRepository extends JpaRepository<CustomerHistorical, Long>{

}
