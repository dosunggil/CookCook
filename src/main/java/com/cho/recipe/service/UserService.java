package com.cho.recipe.service;

import com.cho.recipe.model.UserVO;
import com.cho.recipe.persistance.UserDao;

public interface UserService extends UserDao{

	public UserVO login(UserVO userVO);
	public UserVO join(UserVO userVO);

}
