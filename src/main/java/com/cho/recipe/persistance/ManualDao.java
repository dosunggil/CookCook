package com.cho.recipe.persistance;

import java.util.List;

import com.cho.recipe.model.DosungManualVO;

public interface ManualDao extends GenericDao<DosungManualVO, String>{
	List<DosungManualVO> findByRecipeID(long rcp_SEQ);
}
