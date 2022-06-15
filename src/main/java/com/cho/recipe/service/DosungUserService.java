package com.cho.recipe.service;

import com.cho.recipe.model.UserVO;
import com.cho.recipe.persistance.DosungUserDao;

public interface DosungUserService extends DosungUserDao {

	public UserVO login(UserVO vo);
	public int join(UserVO vo);
}
