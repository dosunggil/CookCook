package com.cho.recipe.persistance;

import com.cho.recipe.model.DosungManualVO;
import com.cho.recipe.model.DosungPostVO;
import com.cho.recipe.model.DosungRecipeVO;
import com.cho.recipe.model.RecipeVO;

public interface ContentListDao extends GenericDao<DosungRecipeVO, Long>{

	public RecipeVO findByContnetID(String contentId);
	public DosungPostVO findByPostSeq(long RCP_SEQ);
	public int insert(DosungManualVO manualVO,DosungRecipeVO postVO);
}
