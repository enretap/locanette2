package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long>{

}
