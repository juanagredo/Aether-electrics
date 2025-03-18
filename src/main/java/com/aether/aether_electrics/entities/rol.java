package com.aether.aether_electrics.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class rol {
    
    @Enumerated(EnumType.STRING)
    private String rol;
    
}
