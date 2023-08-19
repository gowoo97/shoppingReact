package com.gowoo.shopping.Service;

import java.security.Key;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Service
public class JWTService {
	
	public String createToken(String id) {
		String token = Jwts.builder()
				.claim("userId",id)
				.signWith(Keys.hmacShaKeyFor("youcantrevealthesecretkey1234012300040".getBytes()), SignatureAlgorithm.HS256)
				.compact();
		
		return token;
	}
	
}
