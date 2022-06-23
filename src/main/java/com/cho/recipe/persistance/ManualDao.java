package com.cho.recipe.persistance;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cho.recipe.model.DosungManualVO;

public interface ManualDao extends GenericDao<DosungManualVO, String>{
	List<DosungManualVO> findByRecipeID(long rcp_SEQ) ;

	int update(DosungManualVO manualVO, @Param("manual_seq") long rcp_SEQ);
}
