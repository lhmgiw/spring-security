package com.lhmgiw.springsecurity.repository;

import com.lhmgiw.springsecurity.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
