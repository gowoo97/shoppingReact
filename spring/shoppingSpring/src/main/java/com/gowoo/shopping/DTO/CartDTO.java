package com.gowoo.shopping.DTO;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CartDTO {
	
	private String userId;
	
	private String itemName;
	
	private int cnt;
	
}
