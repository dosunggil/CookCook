package com.cho.recipe.service;

import com.cho.recipe.model.DosungManualVO;
import com.cho.recipe.model.DosungPostVO;
import com.cho.recipe.model.DosungRecipeVO;
import com.cho.recipe.persistance.ContentListDao;

public interface ContentsService extends ContentListDao{

	DosungPostVO findByPostSeq(long RCP_SEQ);

	int update(DosungManualVO manualVO, DosungRecipeVO postVO);


}
