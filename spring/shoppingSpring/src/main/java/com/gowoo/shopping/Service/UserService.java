package com.gowoo.shopping.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gowoo.shopping.DTO.User;
import com.gowoo.shopping.Mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper mapper;
	
	
	//멤버 등록
	public void enrollUser(User user) {
		mapper.insertUser(user);
	}
	
	public User Login(User user) {
		
		User selected=mapper.selectUser(user.getId());
		System.out.println(selected);
		
		//아이디와 비밀번호가 일치하면 true
		if(selected.getId().equals(user.getId()) && selected.getPw().equals(user.getPw())) {
			return selected;
		}
		else {
			return null;
		}
		
		
		
	}
	
	public User getUserByUserId(String userId) {
		return	mapper.selectUser(userId);
	}
	
}
