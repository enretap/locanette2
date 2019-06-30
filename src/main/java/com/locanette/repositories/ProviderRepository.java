package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.Provider;

public interface ProviderRepository extends JpaRepository<Provider, Long>{

}
