package com.cho.recipe.persistance;

import java.util.List;

import com.cho.recipe.model.DosungUserVO;

public interface DosungUserDao extends GenericDao<DosungUserVO, String> {
	public List<DosungUserVO> findByName(String name);
	public List<DosungUserVO> findByNickName(String name);
	
	/*
	 * email 항목을 unique 로 한다면
	 * return type 을 List 가 아닌 VO 로 하면 된다.
	 */
	public DosungUserVO findByEmail(String email);
	
	public void create_user_table();
}
