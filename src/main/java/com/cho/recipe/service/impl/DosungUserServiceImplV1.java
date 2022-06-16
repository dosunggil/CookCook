package com.cho.recipe.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.cho.recipe.model.UserVO;
import com.cho.recipe.persistance.DosungUserDao;
import com.cho.recipe.service.DosungUserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DosungUserServiceImplV1 implements DosungUserService{

	@Autowired
	protected DosungUserDao userDao;
	

	
	@Autowired
	@Override
	public void create_user_table() {
//		try {
//			userDao.create_user_table();
//			log.debug("USER TABLE OK!!");
//		} catch (Exception e) {
//			log.debug("USER TABLE CREATE ERROR");
//		}
		
	}
	

	@Override
	public List<UserVO> findByNickName(String nickName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO findByEmail(String email) {
		return userDao.findByEmail(email);
	}



	@Override
	public List<UserVO> selectAll() {
		return null;
		//return userDao.selectAll();
	}

	@Override
	public UserVO findById(String id) {
		return userDao.findById(id);
	}

	@Override
	public int insert(UserVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(UserVO vo) {
		return userDao.update(vo); 
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserVO login(UserVO vo) {
		UserVO loginUser = userDao.findById(vo.getUsername());
		if(loginUser != null &&
			loginUser.getPassword().equals(vo.getPassword())) {
				return loginUser;
			}
		return null;
	}

	@Override
	public int join(UserVO vo) {
		/*
		 * 가입요청한 정보가 최초인지 검사하여
		 * 최초이면 현재 사용자의 role 정보를 ADMIN 으로 설정한다.
		 */
		List<UserVO> users = userDao.selectAll();
		if(users ==null || users.size() <1) {
			vo.setRole("ADMIN");
		} else {
			vo.setRole("GUEST");
		}
		int ret = userDao.insert(vo);
		
		return ret;
	}
	@Override
	public int updatePass(UserVO vo) {
		userDao.updatePass(vo);
		return 0;
	}


	@Override
	public String usercheck(String username, Model model, HttpSession session) {
		UserVO loginUser = (UserVO) session.getAttribute("USER");
		if(loginUser ==null) {
			model.addAttribute("error","LOGIN_NEED");
			return "redirect:/ahn/log/log";
		}
		realUser(username, session);
		return null;
	}

	public void realUser(String username, HttpSession session) {
		UserVO realUser = findById(username);
		session.setAttribute("USER",realUser);
	}
	
	@Override
	public String loggin(UserVO vo , Model model, HttpSession session) {
		UserVO loginUser = findById(vo.getUsername());
		if (loginUser == null) {
			model.addAttribute("error", "USER_FAIL");
			return "redirect:/ahn/log/log";
		}
		loginUser = login(vo);
		if (loginUser == null) {
			model.addAttribute("error", "USER_FAIL");
			return "redirect:/ahn/log/log";
		}
		session.setAttribute("USER", loginUser);
		return "redirect:/";
	}

}
