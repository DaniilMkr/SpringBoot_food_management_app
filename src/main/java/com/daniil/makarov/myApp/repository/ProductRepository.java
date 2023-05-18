package com.daniil.makarov.myApp.repository;

import com.daniil.makarov.myApp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
