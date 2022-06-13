package com.cho.recipe.persistance;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cho.recipe.model.UserRecipeVO;

public interface UserRecipeDao  {

	
public List<UserRecipeVO> selectAll();
	

	public UserRecipeVO findBySeqAndUserName(@Param("b_seq")  String b_seq,
											@Param("username") String username);
	
	public List<UserRecipeVO> findBySeq(String seq);
	public List<UserRecipeVO> findByUserName(String username);
	
	public int insert(UserRecipeVO vo);
}
