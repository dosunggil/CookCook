package com.cho.recipe.service;

import com.cho.recipe.model.DosungRecipeVO;
import com.cho.recipe.model.UserVO;
import com.cho.recipe.persistance.DosungUserRecipeDao;

public interface DosungUserRecipeService extends DosungUserRecipeDao {
	public int insert(UserVO userVO, DosungRecipeVO recipeVO);
}
