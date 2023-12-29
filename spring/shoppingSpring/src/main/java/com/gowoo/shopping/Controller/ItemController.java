package com.gowoo.shopping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/cnt/{count}")
	public ResponseEntity<List<Item>> getItems(@PathVariable("count") int cnt){
		List<Item> items=itemService.getItems(cnt);
		return ResponseEntity.ok().body(items);
	} 
	
	@GetMapping("/{seq}")
	public ResponseEntity<Item> getItem(@PathVariable("seq") long seq){
		Item item=itemService.getItem(seq);
		return ResponseEntity.ok().body(item);
	}
	
}
