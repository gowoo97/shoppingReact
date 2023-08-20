package com.gowoo.shopping.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {

	private long seq;
	
	private String title;
	
	private int price;
	
	private String image;
	
}
