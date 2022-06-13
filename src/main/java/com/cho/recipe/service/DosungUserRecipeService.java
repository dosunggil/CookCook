package com.cho.recipe.service;

import com.cho.recipe.model.DosungRecipeVO;
import com.cho.recipe.model.UserVO;
import com.cho.recipe.persistance.UserRecipeDao;

public interface DosungUserRecipeService extends UserRecipeDao {
	public int insert(UserVO userVO, DosungRecipeVO recipeVO);
}
