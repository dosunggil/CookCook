package com.cho.recipe.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cho.recipe.model.DosungManualVO;
import com.cho.recipe.persistance.ManualDao;
import com.cho.recipe.service.ManualService;

@Service("manualServicev1")
public class ManualServiceImplV1 implements ManualService{

	private final ManualDao manualDao;
	public ManualServiceImplV1(ManualDao manualDao){
		this.manualDao = manualDao;
	}
	@Override
	public List<DosungManualVO> findByRecipeID(long rcp_SEQ) {
		return manualDao.findByRecipeID(rcp_SEQ);
	}
	@Override
	public List<DosungManualVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DosungManualVO findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(DosungManualVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DosungManualVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
