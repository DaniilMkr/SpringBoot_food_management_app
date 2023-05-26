package com.daniil.makarov.myApp.repository;

import com.daniil.makarov.myApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
