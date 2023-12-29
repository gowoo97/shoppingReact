package com.gowoo.shopping.Service;

import java.security.Key;

import org.springframework.stereotype.Service;

import com.gowoo.shopping.DTO.TokenDTO;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Service
public class JWTService {
	
	private Key key=Keys.hmacShaKeyFor("youcantrevealthesecretkey1234012300040".getBytes());
	
	public TokenDTO createToken(String id) {
		String token = Jwts.builder()
				.claim("userId",id)
				.signWith(key, SignatureAlgorithm.HS256)
				.compact();
		
		
		
		return new TokenDTO(token);
	}
	
	public String checkClaim(String token) {
		
		Claims claims=(Claims) Jwts.parserBuilder()
				.setSigningKey(key)
				.build()
				.parseClaimsJws(token)
				.getBody();
		
		
		
		return claims.get("userId").toString();
		
	}
	
	
}
