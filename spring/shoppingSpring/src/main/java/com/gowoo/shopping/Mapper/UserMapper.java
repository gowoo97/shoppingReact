package com.gowoo.shopping.Mapper;

import org.apache.ibatis.annotations.Mapper;

import com.gowoo.shopping.DTO.User;

@Mapper
public interface UserMapper {
	
	void insertUser(User user);
	
}
