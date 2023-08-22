package com.gowoo.shopping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gowoo.shopping.DTO.CartDTO;
import com.gowoo.shopping.Service.CartService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService service;
	
	@PostMapping
	public void addToCart(@RequestBody CartDTO cart) {
		
		service.insertToCart(cart);
		
	}
}
