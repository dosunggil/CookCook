package com.cho.recipe.persistance;

import java.util.List;

import com.cho.recipe.model.DosungRecipeVO;

public interface DosungRecipeDao extends GenericDao<DosungRecipeVO, String> {

	/*
	 * 우선 CRUD 메서드만 구현해보자
	 */
	
	/*
	 * public List<BuyBooksVO> selectAll();
	 * 
	 * 
	 * 	public BuyBooksVO findByIsbnAndUserName(@Param("isbn")  String isbn,
											@Param("username") String username);
	
	public List<BuyBooksVO> findByIsbn(String isbn);
	public List<BuyBooksVO> findByUserName(String username);
		
	public int insert(BuyBooksVO vo);
	 */
	public List<DosungRecipeVO> findByNm(String nm);
}
