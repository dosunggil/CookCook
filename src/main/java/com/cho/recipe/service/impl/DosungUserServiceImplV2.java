package com.cho.recipe.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cho.recipe.config.QualifierConfig;
import com.cho.recipe.model.DosungUserVO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(QualifierConfig.USER_V2)
@Primary
public class DosungUserServiceImplV2 extends DosungUserServiceImplV1{

	@Autowired
	protected PasswordEncoder passwordEncoder;
	
	
	@Override
	public DosungUserVO findById(String id) {
		return userDao.findById(id);
	}
	@Override
	public int join(DosungUserVO vo) {
		
		List<DosungUserVO> users = userDao.selectAll();
		if(users ==null || users.size() <1) {
			vo.setRole("ADMIN");
		} else {
			vo.setRole("GUEST");
		}
	
		
		// password 를 암호화 하자
		String planPassword = vo.getPassword();
		String encPassword = passwordEncoder.encode(planPassword);
		
		// 암호화된 password 를 다시 vo에 setting
		vo.setPassword(encPassword);
		
		// user 정보를 insert
		userDao.insert(vo);
		return 0;
	}

	@Override
	public DosungUserVO login(DosungUserVO vo) {
		DosungUserVO loginUser = userDao.findById(vo.getUsername());

		String encPassword = loginUser.getPassword();
		String planPassword = vo.getPassword();

		// 앞쪽이 평문, 뒷쪽이 암호문
		if (passwordEncoder.matches(planPassword, encPassword)) {
			return loginUser;
		} 

		return null;
	}
}
