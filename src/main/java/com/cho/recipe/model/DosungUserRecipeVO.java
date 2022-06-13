package com.cho.recipe.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class DosungUserRecipeVO {
	/*
	 * tbl_user_recipe 와 연결
	 */

	private String  b_seq;// varchar2(10) not null,
	private String  b_username;// varchar2(50) not null,
	private String  b_date;// varchar2(10),
}
