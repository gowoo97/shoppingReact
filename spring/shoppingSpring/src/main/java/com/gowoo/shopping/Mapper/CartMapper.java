package com.gowoo.shopping.Mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CartMapper {
	
	void insertToCart(HashMap<String, Object> map);
	
}
