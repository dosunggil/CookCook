package com.cho.recipe.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cho.recipe.model.DosungUserRecipeVO;
import com.cho.recipe.model.RegisterVO;
import com.cho.recipe.persistance.RegisterDao;
import com.cho.recipe.service.RegisterService;

@Service("registerServiceV1")
public class RegisterServiceImplV1 implements RegisterService{

	private final RegisterDao registerDao;
	public RegisterServiceImplV1(RegisterDao registerDao) {
		this.registerDao = registerDao;
	}


	@Override
	public DosungUserRecipeVO findById(String id) {
		return registerDao.findById(id);
	}


	@Override
	public List<DosungUserRecipeVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(DosungUserRecipeVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int update(DosungUserRecipeVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}


}
