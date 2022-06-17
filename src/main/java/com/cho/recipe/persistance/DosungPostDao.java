package com.cho.recipe.persistance;

import java.util.List;

import com.cho.recipe.model.DosungDetailVO;
import com.cho.recipe.model.DosungPostVO;
import com.cho.recipe.model.UserVO;

public interface DosungPostDao extends GenericDao<DosungPostVO, String>{

	/*
	 * 추가할 메서드는 아래에 더 작성하면 된다.
	 */
	public String queryString(String cat, String title);
	public String getJsonString(String queryString);
	public List<DosungPostVO> getRecipes(String queryString);
	public List<DosungPostVO> getAllRecipes();
	public List<DosungDetailVO> getDetail(String queryString);
	
}
