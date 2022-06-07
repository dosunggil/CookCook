package com.cho.recipe.dao;

import java.util.List;

import com.cho.recipe.model.DosungPostVO;
import com.cho.recipe.persistance.GenericDao;

public interface DosungPostDao extends GenericDao<DosungPostVO, String>{

	/*
	 * 추가할 메서드는 아래에 더 작성하면 된다.
	 */
	public String queryString(String title, String dtls);
	public String getJsonString(String queryString);
	public List<DosungPostVO> getRecipes(String queryString);
}
