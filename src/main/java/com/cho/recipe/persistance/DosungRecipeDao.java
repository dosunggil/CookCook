package com.cho.recipe.persistance;

import java.util.List;

import com.cho.recipe.model.DosungRecipeVO;

public interface DosungRecipeDao extends GenericDao<DosungRecipeVO, Long> {

	/*
	 * 우선 CRUD 메서드만 구현해보자
	 */
	
	
	public List<DosungRecipeVO> findByNm(String nm);
}
