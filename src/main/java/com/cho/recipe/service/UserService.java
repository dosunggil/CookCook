package com.cho.recipe.service;

import com.cho.recipe.dao.UserDao;
import com.cho.recipe.model.UserVO;

public interface UserService extends UserDao{

	public UserVO login(UserVO userVO);
	public UserVO join(UserVO userVO);

}
