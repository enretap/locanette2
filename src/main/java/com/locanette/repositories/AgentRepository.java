package com.locanette.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locanette.entities.Agent;

public interface AgentRepository extends JpaRepository<Agent, Long>{

}
