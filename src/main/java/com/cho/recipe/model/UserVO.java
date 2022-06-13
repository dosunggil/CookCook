package com.cho.recipe.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
=======
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
>>>>>>> master
@Builder
public class UserVO {

	private String username;
	private String password;
<<<<<<< HEAD
	private String name;
	private String nickname;
	private String email;
	private String role;
}

=======
	private String email;
	private String name;
	private String nickname;
	private String role;
}
>>>>>>> master
