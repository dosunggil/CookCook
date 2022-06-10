package com.cho.recipe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cho.recipe.model.DosungRecipeVO;
import com.cho.recipe.model.DosungUserVO;
import com.cho.recipe.persistance.DosungRecipeDao;
import com.cho.recipe.service.DosungRecipeService;

public class DosungRecipeServiceImplV1 implements DosungRecipeService {

	@Autowired
	protected DosungRecipeDao recipeDao;
	
	
	@Override
	public List<DosungRecipeVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DosungRecipeVO findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int update(DosungRecipeVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(DosungRecipeVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
