package com.gowoo.shopping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.gowoo.shopping.DTO.Item;
import com.gowoo.shopping.Mapper.ItemMapper;

@Service
public class ItemService {

	@Autowired
	private ItemMapper mapper;
	
	
	public List<Item> getItems(int cnt){
		return mapper.getItems(cnt);
	}
	
	public Item getItem(long seq) {
		return mapper.getItem(seq);
	}
	
	public Item getItemByItemName(String itemName) {
		return mapper.getItemByItemName(itemName);
	}
}
