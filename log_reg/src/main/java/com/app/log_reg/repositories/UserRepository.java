package com.app.log_reg.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.log_reg.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
    User findByEmail(String email);
}
