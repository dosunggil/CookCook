package com.cho.recipe.service;

import com.cho.recipe.model.DosungUserVO;
import com.cho.recipe.persistance.DosungUserDao;

public interface DosungUserService extends DosungUserDao {

	public DosungUserVO login(DosungUserVO vo);
	public int join(DosungUserVO vo);
}
