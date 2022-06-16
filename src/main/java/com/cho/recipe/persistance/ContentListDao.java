package com.cho.recipe.persistance;

import java.util.List;

import com.cho.recipe.model.DosungManualVO;
import com.cho.recipe.model.DosungPostVO;
import com.cho.recipe.model.DosungRecipeVO;
import com.cho.recipe.model.RecipeVO;

public interface ContentListDao extends GenericDao<DosungRecipeVO, Long>{

	public RecipeVO findByContnetID(String contentId);
	public List<DosungManualVO> findByRecipeID(String RCP_SEQ);
	public DosungPostVO findByPostSeq(String RCP_SEQ);
}
