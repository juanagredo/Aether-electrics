package com.aether.aether_electrics.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aether.aether_electrics.entities.Factory;

@Repository
public interface FactoryRepository extends JpaRepository<Factory,UUID>{
    
}
