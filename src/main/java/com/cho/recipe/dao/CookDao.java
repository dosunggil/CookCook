package com.cho.recipe.dao;

import java.util.List;

public interface CookDao<VO, PK> {
	public List<VO> selectAll();

	public VO findById(PK id);

	public int insert(VO vo);

	public int update(VO vo);

	public int delete(PK id);

}
