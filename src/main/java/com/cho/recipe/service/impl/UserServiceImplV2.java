package com.cho.recipe.service.impl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cho.recipe.dao.UserDao;
import com.cho.recipe.model.UserVO;
@Service
public class UserServiceImplV2 extends UserServiceImplV1{

	// V1의 생성자 호출하기
		public UserServiceImplV2(UserDao userDao, PasswordEncoder pass) {
			super(userDao, pass);
		}
	@Override
	public UserVO login(UserVO userVO) {
		// Controller에서 전달받은 로그인정보에서
		// username과 password를 추출
		String username = userVO.getUsername();
		String password = userVO.getPassword();
		
		// username으로 회원 DB에서 데이터 Select
		UserVO joinUserVO = userDao.findById(username);
		
		// Select 한 데이터가 null이면 username이 없다
		// 잘못입력했거나 아직 회원가입하지 않은 상태
		// Select한 데이터가 null이 아니면 username이 있다
		if(joinUserVO != null) {
			// username으로 조회한 데이터가 있으면
			// DB에 저장된 password와 입력한 password와 비교
			boolean bYes = passwordEncoder.matches(password, joinUserVO.getPassword());
			
			// 비밀번호가 일치 하지 않으면
			// null을 return하고 종료하기
			// if( !bYes)
			if(bYes == false) {
				return null;
			}
		}
		// 정상 로그인되면 joinUserVO 에는 사용자 정보데이터가 담기고
		// 그렇지 않으면 null 값이 담겨져 있을 것이다
		return joinUserVO;
	}	

	
}
