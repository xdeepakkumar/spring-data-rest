package com.springdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springdatarest.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
