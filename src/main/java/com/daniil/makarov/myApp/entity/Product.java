package com.daniil.makarov.myApp.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Calendar;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Product {
    private Long id;
    private String name;
    private Calendar dateOfExpiration;
    private boolean isSolid;
}