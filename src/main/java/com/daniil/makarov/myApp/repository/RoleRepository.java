package com.daniil.makarov.myApp.repository;

import com.daniil.makarov.myApp.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
