package com.gowoo.shopping.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gowoo.shopping.DTO.CartDTO;
import com.gowoo.shopping.Service.CartService;


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
	
	@GetMapping
	public List<Map<String,Object>> getCartList(){
		return service.getCartList();
	}
	
	@DeleteMapping
	public ResponseEntity deleteCart(@RequestBody HashMap<String,Object> map) {
		service.deleteCart((Integer)(map.get("id")));
		return new ResponseEntity(HttpStatus.OK);
	}
	
	
	
	
	
}
