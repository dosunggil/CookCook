package com.cho.recipe.service;

import com.cho.recipe.model.DosungRecipeVO;
import com.cho.recipe.model.DosungUserVO;
import com.cho.recipe.persistance.DosungRecipeDao;

public interface DosungRecipeService extends DosungRecipeDao{
	
	public int insert(DosungUserVO userVO, DosungRecipeVO recipeVO);

}
