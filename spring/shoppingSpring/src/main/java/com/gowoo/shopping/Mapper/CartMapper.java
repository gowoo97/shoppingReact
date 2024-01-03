package com.gowoo.shopping.Mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CartMapper {
	
	void insertToCart(HashMap<String, Object> map);
	
	List<Map<String,Object>> getCartList(int value);
	
}
