package com.gowoo.shopping.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gowoo.shopping.DTO.Item;

@Mapper
public interface ItemMapper {

	
	List<Item> getItems(int cnt);
	
	Item getItem(long seq);

}
