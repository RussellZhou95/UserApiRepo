package com.example;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.model.User;
import com.example.repo.UserRepository;

@SpringBootApplication
public class UserRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserRestApiApplication.class, args);
	}

	
//	@Bean
//    CommandLineRunner init(UserRepository userRepo) {
//        return args -> {
//            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
//                User user = new User(name, name.toLowerCase() + "@domain.com");
//                userRepo.save(user);
//            });
//            userRepo.findAll().forEach(System.out::println);
//        };
//    }
	//This is what I modified
	//This is the modified version on feature/GWM6009 branch
	//This is the second branch feature/GWM7002 branch
	//This is the fourth change
	//This is the fifth change
	//This is the sixth change, modified on bitbucket repo directly,then modified on local
	//This is the seventh change, modified on bitbucket feature/TestBranch directly
}
