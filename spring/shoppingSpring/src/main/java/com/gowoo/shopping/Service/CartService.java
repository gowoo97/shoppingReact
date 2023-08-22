package com.gowoo.shopping.Service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gowoo.shopping.DTO.CartDTO;
import com.gowoo.shopping.DTO.Item;
import com.gowoo.shopping.DTO.User;
import com.gowoo.shopping.Mapper.CartMapper;
import com.gowoo.shopping.Mapper.ItemMapper;
import com.gowoo.shopping.Mapper.UserMapper;

@Service
public class CartService {
	
	@Autowired
	private CartMapper cartMapper;
	
	@Autowired
	private ItemMapper itemMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	public void insertToCart(CartDTO cart) {
		
		Item item = itemMapper.getItemByItemName(cart.getItemName());
		
		User user = userMapper.selectUser(cart.getUserId());
		
		HashMap<String,Object> hm=new HashMap<>();
		
		hm.put("user_seq",user.getSeq());
		hm.put("item_seq",item.getSeq());
		hm.put("cnt",cart.getCnt());
		
		cartMapper.insertToCart(hm);
		
		
	}
	
	
	
	
}
