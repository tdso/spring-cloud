package com.tdso.hroauth.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tdso.hroauth.model.User;
import com.tdso.hroauth.service.OAuthService;

@RestController
@RequestMapping(value="/users")
public class OauthResource {
	
	@Autowired
	private OAuthService service;
	
	@GetMapping(value="/search")
	public User getUser (@RequestParam String email) throws Exception {
		System.out.println("OAUTH > resource");
		System.out.println("email = " + email);
		return service.getUserByEmail(email);
	}

}
