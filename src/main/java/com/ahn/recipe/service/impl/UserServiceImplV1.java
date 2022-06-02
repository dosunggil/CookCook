package com.ahn.recipe.service.impl;

import java.util.List;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ahn.recipe.dao.UserDao;
import com.ahn.recipe.model.UserVO;
import com.ahn.recipe.service.UserService;

@Service("userServiceV1")
public class UserServiceImplV1 implements UserService {

	// security-context.xml에 설정된 bean 불러오기
	protected final PasswordEncoder pass;
	protected final UserDao userDao;

	public UserServiceImplV1(UserDao userDao, PasswordEncoder pass) {
		this.userDao = userDao;
		this.pass = pass;
	}

	@Override
	public List<UserVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserVO findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(UserVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(UserVO vo) {
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
		String name = userVO.getName();
		String nickname = userVO.getNickname();
		String email = userVO.getEmail();

		if (username.equalsIgnoreCase("ghdrlfehd") && password.equals("1234")) {
			userVO.setName("홍길동");
			userVO.setNickname("hong");
			userVO.setEmail("hong@naver.com");
		} else {
			userVO = null;
		}
		return userVO;
	}

	@Override
	public UserVO join(UserVO userVO) {
		// 회원가입한 user의 정보를 저장하기 전에
				// 비밀번호를 암호화 하자
				String encPassword = pass.encode(userVO.getPassword());
				userVO.setPassword(encPassword);
				
				// 1. user table에 데이터가 있는지 확인하기 위하여
				//		전체 데이터를 select 하기
				List<UserVO> userList = userDao.selectAll();
				// 만약 user table에 데이터가 없으면 null을 return한다
				if(userList == null || userList.size() < 1) {
					// 데이터가 없으면 최초 가입자이므로
					// role(권한)을 ADMIN(관리자)로 부여한다
					userVO.setRole("ADMIN");
				} else {
					userVO.setRole("USER");
				}
				userDao.insert(userVO);
				return null;
	}
}