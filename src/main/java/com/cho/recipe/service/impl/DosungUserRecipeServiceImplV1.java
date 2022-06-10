package com.cho.recipe.service.impl;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cho.recipe.model.DosungRecipeVO;
import com.cho.recipe.model.DosungUserRecipeVO;
import com.cho.recipe.model.DosungUserVO;
import com.cho.recipe.persistance.DosungRecipeDao;
import com.cho.recipe.persistance.DosungUserRecipeDao;
import com.cho.recipe.service.DosungUserRecipeService;

public class DosungUserRecipeServiceImplV1 implements DosungUserRecipeService{

	@Autowired
	protected DosungRecipeDao recipeDao;
	
	@Autowired
	protected DosungUserRecipeDao userRecipeDao;
	
	@Override
	public List<DosungUserRecipeVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DosungUserRecipeVO findBySeqAndUserName(String seq, String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DosungUserRecipeVO> findBySeq(String seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DosungUserRecipeVO> findByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	// 쓰지 않을거양
	@Override
	public int insert(DosungUserRecipeVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public int insert(DosungUserVO userVO, DosungRecipeVO recipeVO) {
		// 구입한 도서정보를 tbl_buybooks 에 추가하기
		
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		DosungUserRecipeVO userrecipeVO = DosungUserRecipeVO.builder()
				.b_date(dateFormat.format(date))
				.b_seq(recipeVO.getRecipe_seq())
				.b_username(userVO.getUsername())
				.build();
		userRecipeDao.insert(userrecipeVO);
		return 0;
	}

}
