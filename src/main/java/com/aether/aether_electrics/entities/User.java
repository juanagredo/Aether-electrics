package com.aether.aether_electrics.entities;

import java.util.UUID;

import com.aether.aether_electrics.enums.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class User {
     
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID userId;

    private String email;
    private String name;
    private String lastName;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role = Role.USER;


    


}
