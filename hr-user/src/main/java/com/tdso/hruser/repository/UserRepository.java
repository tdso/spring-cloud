package com.tdso.hruser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tdso.hruser.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);

}
