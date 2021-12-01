package com.tdso.hroauth.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tdso.hroauth.model.User;

@Component
@FeignClient(name="hr-user", path="/users")
public interface OauthFeignClient {
	
	@GetMapping(value="/search") // teste: url/search?email=leia@gmail.com
	ResponseEntity<User> getUserByEmail (@RequestParam String email);

}
