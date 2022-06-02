package com.ahn.recipe.dao;

import java.util.List;

public interface GenericDao<VO, PK> {

	public List<VO> selectAll(); // selectAll의 return 값은 List<VO>이다
	public VO findById(PK id);
	
	public int insert(VO vo);
	public int update(VO vo);
	public int delete(PK id);

}
