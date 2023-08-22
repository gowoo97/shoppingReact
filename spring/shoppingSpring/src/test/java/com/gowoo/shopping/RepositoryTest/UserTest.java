package com.gowoo.shopping.RepositoryTest;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gowoo.shopping.DTO.User;
import com.gowoo.shopping.Mapper.UserMapper;

public class UserTest {

	@Autowired
	UserMapper mapper;
	
	
	@Test
	public void selectUser() {
		User user=mapper.selectUser("gggg");
		assertEquals(user.getId(),"gggg");
	}

}
