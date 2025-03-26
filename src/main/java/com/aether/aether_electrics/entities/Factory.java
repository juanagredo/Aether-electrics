package com.aether.aether_electrics.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Factory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID factoryId;
    
    private String FactoryName;

    
}
