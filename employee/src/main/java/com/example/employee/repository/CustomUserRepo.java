package com.example.employee.repository;
import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.entity.UserEntity;

@Repository
public interface CustomUserRepo extends JpaRepository<UserEntity, Integer> {

    // FIND USER BY EMAIL
    // UserEntity findByEmail(String email);
    Optional<UserEntity> findByEmail(String email);

}
