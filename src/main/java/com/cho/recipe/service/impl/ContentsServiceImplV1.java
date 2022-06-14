package com.cho.recipe.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cho.recipe.model.ContentVO;
import com.cho.recipe.model.DosungRecipeVO;
import com.cho.recipe.model.ManualVO;
import com.cho.recipe.model.RecipeVO;
import com.cho.recipe.persistance.ContentListDao;
import com.cho.recipe.service.ContentsService;

@Service("contentsServicev1")
public class ContentsServiceImplV1 implements ContentsService {
	
	ContentListDao contentListDao;
	public ContentsServiceImplV1(ContentListDao contentListDao) {
		this.contentListDao=contentListDao;
	}
	@Override
	public RecipeVO findByContnetID(String contentId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ManualVO> findByRecipeID(String recipeId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ContentVO findByPostSeq(String post_seq) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<DosungRecipeVO> selectAll() {
		return contentListDao.selectAll();
	}
	@Override
	public DosungRecipeVO findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int insert(DosungRecipeVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(DosungRecipeVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}
	


}
