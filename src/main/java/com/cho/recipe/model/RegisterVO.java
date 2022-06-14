package com.cho.recipe.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterVO {
	private String c_seq;
	private String r_date;
	private String c_username;
	private String c_post_seq;
	private ContentVO contentVO;
	private UserVO userVO;
}
