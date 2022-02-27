package com.example.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springboot.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends JpaRepository<User, Integer>, CrudRepository<User, Integer> {
    Integer countByLoginIdAndPassword(String loginId, String password);
}
