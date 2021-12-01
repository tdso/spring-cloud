package com.tdso.hroauth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdso.hroauth.feignclient.OauthFeignClient;
import com.tdso.hroauth.model.User;

@Service
public class OAuthService {
	
	@Autowired
	private OauthFeignClient oauthFeignClient;
	
	public User getUserByEmail(String email) throws Exception {
		
		System.out.println("OAUTH > service");
		
		User user = (User) oauthFeignClient.getUserByEmail(email).getBody();
		System.out.println("user retornado = " + user.toString());
		if (user == null) throw new Exception("Usuario inexistente !!");
		return user;
		
	}

}
