package com.gowoo.shopping.Service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.gowoo.shopping.DTO.CartDTO;
import com.gowoo.shopping.DTO.User;
import com.gowoo.shopping.Mapper.CartMapper;

@Service
public class CartService {
	
	@Autowired
	private CartMapper cartMapper;
	
	public void insertToCart(CartDTO cart) {
		
		
		User user=getUserStat();
		HashMap<String,Object> hm=new HashMap<>();
	
		hm.put("user_seq",user.getSeq());
		hm.put("item_seq",cart.getItemId());
		hm.put("cnt",cart.getCnt());

		cartMapper.insertToCart(hm);
	
	}
	
	
	public User getUserStat() {
		return (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}
	
	
	
	
}
