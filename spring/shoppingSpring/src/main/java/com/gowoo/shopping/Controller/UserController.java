package com.gowoo.shopping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gowoo.shopping.DTO.User;
import com.gowoo.shopping.Service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/user")
	public void enrollUser(@RequestBody User user) {
		service.enrollUser(user);
	}
}
