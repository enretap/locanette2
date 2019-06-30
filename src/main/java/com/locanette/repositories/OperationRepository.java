package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.Operation;

public interface OperationRepository extends JpaRepository<Operation, Long>{

}
