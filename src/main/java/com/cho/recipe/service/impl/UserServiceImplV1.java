package com.cho.recipe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cho.recipe.model.UserVO;
import com.cho.recipe.persistance.UserDao;
import com.cho.recipe.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserServiceImplV1 implements UserService {

	protected final UserDao userDao;
	// security-context.xml에 설정된 bean 불러오기
	protected final PasswordEncoder passwordEncoder;

	@Autowired
	@Override
	public void create_user_table() {
		try {
			userDao.create_user_table();
			log.debug("USER TABLE OK!!");
		} catch (Exception e) {
			log.debug("USER TABLE CREATE ERROR!!");
		}
	}

	public UserServiceImplV1(UserDao userDao, PasswordEncoder passwordEncoder) {
		this.userDao = userDao;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public List<UserVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO findById(String id) {
		return userDao.findById(id);
	}

	@Override
	public List<UserVO> findByNickName(String nickname) {
		return userDao.findByNickName(nickname);
	}

	@Override
	public int insert(UserVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserVO login(UserVO userVO) {
		String username = userVO.getUsername();
		String password = userVO.getPassword();
		String nickname = userVO.getNickname();
		String email = userVO.getEmail();

		if (username.equalsIgnoreCase("ghdrlfehd") && password.equals("1234")) {
			userVO.setNickname("hong");
			userVO.setEmail("hong@naver.com");
		} else {
			userVO = null;
		}
		return null;
	}

	@Override
	public UserVO join(UserVO userVO) {
		// 회원가입한 user의 정보를 저장하기 전에
		// 비밀번호를 암호화 하자
		String planPassword = userVO.getPassword();
		log.debug(userVO.toString());
		String encPassword = passwordEncoder.encode(planPassword);
		userVO.setPassword(encPassword);

		// user 정보를 insert

		// 1. user table에 데이터가 있는지 확인하기 위하여
		// 전체 데이터를 select 하기
		List<UserVO> userList = userDao.selectAll();
		// 만약 user table에 데이터가 없으면 null을 return한다
		if (userList == null || userList.size() < 1) {
			// 데이터가 없으면 최초 가입자이므로
			// role(권한)을 ADMIN(관리자)로 부여한다
			userVO.setRole("ADMIN");
		} else {
			userVO.setRole("USER");
		}
		userDao.insert(userVO);
		return null;
	}

	@Override
	public UserVO findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	@Override
	public int update(UserVO vo) {
		userDao.update(vo);
		return 0;
	}

	@Override
	public int updatePass(UserVO userVO) {

		String planPassword = userVO.getPassword();

		String encPassword = passwordEncoder.encode(planPassword);
		userVO.setPassword(encPassword);

		userDao.updatePass(userVO);
		return 0;
	}
}