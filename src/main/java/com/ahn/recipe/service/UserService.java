package com.ahn.recipe.service;

import com.ahn.recipe.dao.GenericDao;
import com.ahn.recipe.model.UserVO;

public interface UserService extends GenericDao<UserVO, String>{

	public UserVO login(UserVO userVO);
	public UserVO join(UserVO userVO);

}
