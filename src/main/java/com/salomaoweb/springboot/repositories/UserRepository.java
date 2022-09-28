package com.salomaoweb.springboot.repositories;

import com.salomaoweb.springboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
