package com.cho.recipe.persistance;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.cho.recipe.model.UserVO;

public interface DosungUserDao extends GenericDao<UserVO, String> {
	public List<UserVO> findByNickName(String nickName);
	
	/*
	 * email 항목을 unique 로 한다면
	 * return type 을 List 가 아닌 VO 로 하면 된다.
	 */
	public UserVO findByEmail(String email);
	
	public void create_user_table();
	
	public int updatePass(UserVO vo);
	
	public String usercheck(String username, Model model, HttpSession session);
	public String loggin(UserVO vo , Model model, HttpSession session);

}
