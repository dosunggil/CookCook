package com.cho.recipe.dao;

import java.util.List;

import com.cho.recipe.model.UserVO;

public interface GenericDao<VO, PK> {

	public List<VO> selectAll(); // selectAll의 return 값은 List<VO>이다
	public VO findById(PK id);
	public VO findByNick(PK id);
	public int insert(VO vo);
	public int update(VO vo);
	public int delete(PK id);

}
