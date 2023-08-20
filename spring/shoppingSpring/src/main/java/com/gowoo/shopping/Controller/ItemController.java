package com.gowoo.shopping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gowoo.shopping.DTO.Item;
import com.gowoo.shopping.Service.ItemService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@GetMapping
	public ResponseEntity<List<Item>> getItems(){
		List<Item> items=itemService.getItems();
		return ResponseEntity.ok().body(items);
	}
	
}
