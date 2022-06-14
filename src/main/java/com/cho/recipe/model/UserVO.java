package com.cho.recipe.model;

import lombok.AllArgsConstructor;
<<<<<<< HEAD
=======
import lombok.Builder;
>>>>>>> master
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

<<<<<<< HEAD
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserVO {
	private String username;
	private String password;
	private String nickname;
	private String name;
	private String email;
=======

@Setter
@Getter
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
>>>>>>> master
}
