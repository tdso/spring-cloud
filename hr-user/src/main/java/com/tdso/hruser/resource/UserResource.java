package com.tdso.hruser.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tdso.hruser.model.User;
import com.tdso.hruser.repository.UserRepository;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value="/search") // teste: url/search?email=leia@gmail.com
	public ResponseEntity<User> getUserByEmail (@RequestParam String email) {
		
		return ResponseEntity.ok(userRepository.findByEmail(email));
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<User> getUserById (@PathVariable Long id) {
		
		return ResponseEntity.ok(userRepository.findById(id).get());
	}
	

}
