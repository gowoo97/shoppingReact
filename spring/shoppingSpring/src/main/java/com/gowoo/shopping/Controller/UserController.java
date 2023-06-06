package com.gowoo.shopping.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gowoo.shopping.DTO.User;

@RestController
public class UserController {

	@PostMapping("/user")
	public void enrollUser(@RequestBody User user) {
		System.out.println(user);
	}
}
