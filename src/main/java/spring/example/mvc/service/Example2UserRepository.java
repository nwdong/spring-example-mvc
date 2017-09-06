package spring.example.mvc.service;

import org.springframework.data.repository.Repository;

import spring.example.mvc.domain.Example2User;

public interface Example2UserRepository extends Repository<Example2User, Long>{

	Example2User save(Example2User user);
	  
	Example2User findByUsername(String username);
	  
}
