package com.gowoo.shopping.DTO;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CartDTO {
	
	private int userId;
	
	private int itemId;
	
	private int cnt;
	
}
