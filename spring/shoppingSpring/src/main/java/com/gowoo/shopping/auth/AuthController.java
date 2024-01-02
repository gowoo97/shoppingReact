package com.gowoo.shopping.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gowoo.shopping.DTO.TokenDTO;
import com.gowoo.shopping.DTO.User;
import com.gowoo.shopping.Service.JWTService;
import com.gowoo.shopping.Service.UserService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private UserService userService;

	@Autowired
	private JWTService jwtService; 
	
	@PostMapping("/signUp")
	public void signUp(@RequestBody User user) {
		System.out.println(user);
		userService.enrollUser(user);
	}
	
	@PostMapping("/signIn")
	public ResponseEntity<TokenDTO> signIn(@RequestBody User user){
		if(userService.Login(user)!=null) {
			
			TokenDTO token=jwtService.createToken(user);
			return ResponseEntity.ok().body(token);
		}
		else {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	
	
	
}
