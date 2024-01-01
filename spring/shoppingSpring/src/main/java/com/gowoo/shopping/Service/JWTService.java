package com.gowoo.shopping.Service;

import java.security.Key;

import org.springframework.stereotype.Service;

import com.gowoo.shopping.DTO.TokenDTO;
import com.gowoo.shopping.DTO.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Service
public class JWTService {
	
	private Key key=Keys.hmacShaKeyFor("youcantrevealthesecretkey1234012300040".getBytes());
	
	public TokenDTO createToken(User user) {
		String token = Jwts.builder()
				.claim("userId",user.getId())
				.claim("pw",user.getPw())
				.claim("seq",user.getSeq())
				.signWith(key, SignatureAlgorithm.HS256)
				.compact();
		
		
		
		return new TokenDTO(token);
	}
	
	public User checkClaim(String token) {
		
		Claims claims=(Claims) Jwts.parserBuilder()
				.setSigningKey(key)
				.build()
				.parseClaimsJws(token)
				.getBody();
		
		User user=new User();
		user.setSeq(Integer.parseInt(claims.get("seq").toString()));
		user.setId(claims.get("userId").toString());
		
		return user;
		
	}
	
	
}
