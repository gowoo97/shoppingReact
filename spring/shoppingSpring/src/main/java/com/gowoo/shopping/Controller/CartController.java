package com.gowoo.shopping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gowoo.shopping.DTO.CartDTO;
import com.gowoo.shopping.Service.CartService;

import jakarta.servlet.http.HttpServletResponse;


@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins = "*")
public class CartController {

	@Autowired
	private CartService service;
	
	@PostMapping
	public ResponseEntity addToCart(@RequestBody CartDTO cart) {
		
		service.insertToCart(cart);
		
		return new ResponseEntity(HttpStatus.OK);
		
	}
}
