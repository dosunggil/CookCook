package com.cho.recipe.persistance;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cho.recipe.model.DosungUserRecipeVO;

public interface DosungUserRecipeDao  {

	
public List<DosungUserRecipeVO> selectAll();
	

	public DosungUserRecipeVO findBySeqAndUserName(@Param("seq")  String seq,
											@Param("username") String username);
	
	public List<DosungUserRecipeVO> findBySeq(String seq);
	public List<DosungUserRecipeVO> findByUserName(String username);
	
	public int insert(DosungUserRecipeVO vo);
}
