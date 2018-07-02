package com.example.tenant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class TenantApplication {

	@RequestMapping("/user") // TODO: don't return the whole Principal
	public Principal user(Principal principal){
		return principal;
	}

	public static void main(String[] args) {
		SpringApplication.run(TenantApplication.class, args);
	}
}
