package com.springdatarest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.springdatarest.entity.User;

@Repository
@RepositoryRestResource(path = "employees")
public interface UserRepository extends JpaRepository<User, Long> {
	
	List<User> findByFirstName(@Param("firstName") String firstNameString);
}
