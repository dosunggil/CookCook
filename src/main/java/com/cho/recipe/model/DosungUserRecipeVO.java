package com.cho.recipe.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/*
 * tbl_user_recipe 와 연결
 */

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class DosungUserRecipeVO {

	private long  b_seq;
	private String  b_username;
	private String  b_date;
	
	
	private DosungRecipeVO recipe;
	private DosungUserVO user;
}
