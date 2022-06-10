package com.cho.recipe.service;

import com.cho.recipe.model.DosungRecipeVO;
import com.cho.recipe.model.DosungUserVO;
import com.cho.recipe.persistance.DosungUserRecipeDao;

public interface DosungUserRecipeService extends DosungUserRecipeDao {
	public int insert(DosungUserVO userVO, DosungRecipeVO recipeVO);
}
