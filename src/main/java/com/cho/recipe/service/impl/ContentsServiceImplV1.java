package com.cho.recipe.service.impl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.cho.recipe.dao.ContentListDao;
import com.cho.recipe.model.ContentVO;
import com.cho.recipe.service.ContentsService;

@Service("contentsServicev1")
public class ContentsServiceImplV1 implements ContentsService {
	
	ContentListDao contentListDao;
	public ContentsServiceImplV1(ContentListDao contentListDao) {
		this.contentListDao=contentListDao;
	}
	@Override
	public List<ContentVO> selectAll() {
		return contentListDao.selectAll();
	}

	@Override
	public ContentVO findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(ContentVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(ContentVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}
	


}
