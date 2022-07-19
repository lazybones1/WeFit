package com.example.springjwt.repository;

import com.example.springjwt.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
