package com.cho.recipe.service;

import java.util.List;

import com.cho.recipe.model.ContentVO;

public interface ContentsService {
	public List<ContentVO> selectAll();

	public ContentVO findById(String id);

	public int insert(ContentVO vo);

	public int update(ContentVO vo);

	public int delete(String id);
}
