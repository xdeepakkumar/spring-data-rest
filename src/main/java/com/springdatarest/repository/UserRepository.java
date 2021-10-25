package com.springdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdatarest.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
