package com.gowoo.shopping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
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
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private	UserService userService;
	
	@Autowired
	private JWTService jwtService; 
	
	@PostMapping
	public ResponseEntity<String> login(@RequestBody User user) {	
			if(userService.Login(user)) {
				
				String token=jwtService.createToken(user.getId());
				HttpHeaders responseHeaders = new HttpHeaders();
				responseHeaders.set("Authorization","Bearer "+token);
				return ResponseEntity.ok().headers(responseHeaders)
						.body(token);
			}
			else {
				return ResponseEntity.badRequest().body(null);
			}
	}
	
	@PostMapping("/check")
	public void checkToken(@RequestBody TokenDTO token) {
		System.out.println(token);
		jwtService.checkClaim(token.getToken());
		
	}
}
