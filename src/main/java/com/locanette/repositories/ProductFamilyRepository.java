package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.ProductFamily;

public interface ProductFamilyRepository extends JpaRepository<ProductFamily, Long>{

}
