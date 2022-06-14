package com.cho.recipe.dao;

import java.util.List;

import com.cho.recipe.model.ContentVO;
import com.cho.recipe.model.ManualVO;
import com.cho.recipe.model.RecipeVO;

public interface ContentListDao extends CookDao<ContentVO, String>{

	public RecipeVO findByContnetID(String contentId);
	public List<ManualVO> findByRecipeID(String recipeId);
	public ContentVO findByPostSeq(String post_seq);
}
