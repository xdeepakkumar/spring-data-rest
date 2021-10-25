package com.springdatarest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.springdatarest.entity.User;

@Repository
@RepositoryRestResource(path = "employees")
public interface UserRepository extends JpaRepository<User, Long> {

}
