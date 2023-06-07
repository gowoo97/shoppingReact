package com.gowoo.shopping.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gowoo.shopping.DTO.User;
import com.gowoo.shopping.Mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper mapper;
	
	public void enrollUser(User user) {
		mapper.insertUser(user);
	}
	
}
