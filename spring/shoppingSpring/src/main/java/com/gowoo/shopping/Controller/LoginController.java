package com.gowoo.shopping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	public ResponseEntity<TokenDTO> login(@RequestBody User user) {	
			if(userService.Login(user)) {
				String token=jwtService.createToken(user.getId());
				TokenDTO tokenDTO=new TokenDTO().builder().token(token).build();
				return ResponseEntity.ok().body(tokenDTO);
			}
			else {
				return ResponseEntity.badRequest().body(null);
			}
	}
}
