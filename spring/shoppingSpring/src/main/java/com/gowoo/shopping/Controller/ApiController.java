package com.gowoo.shopping.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class ApiController {

	@PostMapping("/test")
	public String test(){
	String userId=SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString();
		System.out.println(userId);
		return "test";
	}

}
