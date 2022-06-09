package com.cho.recipe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cho.recipe.config.QualifierConfig;
import com.cho.recipe.model.DosungUserVO;
import com.cho.recipe.persistance.DosungUserDao;
import com.cho.recipe.service.DosungUserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@Service(QualifierConfig.USER_V1)
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
	public List<DosungUserVO> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DosungUserVO> findByNickName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DosungUserVO findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<DosungUserVO> selectAll() {
		return null;
		//return userDao.selectAll();
	}

	@Override
	public DosungUserVO findById(String id) {
		return userDao.findById(id);
	}

	@Override
	public int insert(DosungUserVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DosungUserVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DosungUserVO login(DosungUserVO vo) {
		DosungUserVO loginUser = userDao.findById(vo.getUsername());
		if(loginUser != null &&
			loginUser.getPassword().equals(vo.getPassword())) {
				return loginUser;
			}
		return null;
	}

	@Override
	public int join(DosungUserVO vo) {
		/*
		 * 가입요청한 정보가 최초인지 검사하여
		 * 최초이면 현재 사용자의 role 정보를 ADMIN 으로 설정한다.
		 */
		List<DosungUserVO> users = userDao.selectAll();
		if(users ==null || users.size() <1) {
			vo.setRole("ADMIN");
		} else {
			vo.setRole("GUEST");
		}
		int ret = userDao.insert(vo);
		
		return ret;
	}

}
