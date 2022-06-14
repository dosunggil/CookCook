package com.cho.recipe.model;

import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class UserVO {

	private String username;
	private String password;
	private String name;
	private String nickname;
	private String email;
	private String role;

}
