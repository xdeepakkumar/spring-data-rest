package com.springdatarest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springdatarest.entity.User;
import com.springdatarest.repository.UserRepository;

@SpringBootApplication
public class SpringDataRestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestApplication.class, args);
	}
	
	//user repository
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User user1 = User.builder().firstName("Deepak").lastName("Kumar").email("deepak@gmail.com").build();
		userRepository.save(user1);
		User user2 = User.builder().firstName("Suraj").lastName("Kumar").email("suraj@gmail.com").build();
		userRepository.save(user2);
		User user3 = User.builder().firstName("Vijay").lastName("Kumar").email("vijay@gmail.com").build();
		userRepository.save(user3);
		User user4 = User.builder().firstName("Anil").lastName("Kumar").email("anil@gmail.com").build();
		userRepository.save(user4);
		User user5 = User.builder().firstName("Sunil").lastName("Kumar").email("sunil@gmail.com").build();
		userRepository.save(user5);
		
		
	}

}
