package com.cho.recipe.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cho.recipe.model.DosungManualVO;
import com.cho.recipe.model.DosungPostVO;
import com.cho.recipe.model.DosungRecipeVO;
import com.cho.recipe.model.RecipeVO;
import com.cho.recipe.persistance.ContentListDao;
import com.cho.recipe.persistance.ManualDao;
import com.cho.recipe.service.ContentsService;

@Service("contentsServicev1")
public class ContentsServiceImplV1 implements ContentsService {
	
	private final ContentListDao contentListDao;
	private final ManualDao manualDao;
	public ContentsServiceImplV1(ContentListDao contentListDao, ManualDao manualDao) {
		this.contentListDao=contentListDao;
		this.manualDao = manualDao;
	}
	@Override
	public DosungPostVO findByPostSeq(long RCP_SEQ) {
		return contentListDao.findByPostSeq(RCP_SEQ);
	}
	@Override
	public RecipeVO findByContnetID(String contentId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<DosungRecipeVO> selectAll() {
		return contentListDao.selectAll();
	}
	@Override
	public int insert(DosungRecipeVO vo) {
		
		return contentListDao.insert(vo);
	}
	@Override
	public int insert(DosungManualVO manualVO, DosungRecipeVO postVO) {
		manualVO.setPost_seq(postVO.getRCP_SEQ());
		manualDao.insert(manualVO);
		return 0;
	}
	@Override
	public DosungRecipeVO findById(Long id) {
		// TODO Auto-generated method stub
		return null;
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
