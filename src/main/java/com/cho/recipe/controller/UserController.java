package com.cho.recipe.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cho.recipe.model.UserVO;
import com.cho.recipe.service.DosungUserRecipeService;
import com.cho.recipe.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
//http://localhost:808ipe/ahn/user/searchPASS/updatePASS
@RequestMapping(value = "/ahn/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private DosungUserRecipeService dosungUserRecipeService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return null;
	}

	/*
	 * 1. login.form에서 username과 password 받기 2. userVO에 담겨서 받게 된다 3. userVO
	 * UserService.login에게 전달한다 4. UserService.login() method는 username과 password 검사
	 * 5. 정상적인(username, password가 일치) 정보이면 나머지 user 정보를 userVO에 담아서 return 만약 정상적인
	 * 사용자가 아니면 null을 return 6. Controller.login.POST method에는 HttpSession 클래스를
	 * 매개변수로 설정한다 7. 정상 사용자 정보이면(userVO가 null이 아니면) setAttribute() method를 사용하여 사용자
	 * 정보를 변수에 setting 한다 8. 정상 사용자가 아니면 removeAttribute() method를 사용하여 변수를 제거해 버린다
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(UserVO userVO, HttpSession session, Model model) {
		// 로그인 폼에서 입력한 username, password는 userVO에 담겨
		// 이곳에 도착한다
		log.debug(userVO.toString());

		// Server와 view 사이에서 약속된 Protocol을 사용하기 위하여
		// 변수를 선언하고
		String loginMessage = null;
		String loginNickMessage = null;

		// 로그인 폼에서 전송된 데이터 중 username으로
		// findById() 즉 SelectOne(username)을 실행한다
		// 그리고 결과를 loginUserVO에 담는다
		// 만약 username정보가 user table에 없으면
		// 결과는 null이고 정보가 있으면
		// 관련 데이터가 포함된 vo가 만들어진다
		UserVO loginUserVO = userService.findById(userVO.getUsername());
		UserVO loginNicknameVO = userService.findById(userVO.getNickname());

		// username이 가입된 적이 없을 때
		if (loginUserVO == null) {
			// 가입된 적이 없다는 Key word를 생성하고
			loginMessage = "USERNAME FAIL";
		} else // else if
		// username은 있는데 password가 다를 경우

		if (!loginUserVO.getPassword().equals(userVO.getPassword())) {
			// 비밀번호가 잘못되었다는 Key word를 생성하고
			loginMessage = "PASSWORD FAIL";
		}
		if (loginNicknameVO == null) {
			// 가입된 적이 없다는 Key word를 생성하고
			loginNickMessage = "NICKNAME FAIL";
		} else // else if
		// username은 있는데 password가 다를 경우

		if (!loginUserVO.getPassword().equals(userVO.getPassword())) {
			// 비밀번호가 잘못되었다는 Key word를 생성하고
			loginNickMessage = "PASSWORD FAIL";
		}

		// 로그인되었는지 그렇지 않은지 세션에 setting하기
		if (loginMessage == null) {
			session.setAttribute("USER", loginUserVO);
		} else {
			session.removeAttribute("USER");
		}
		// view로 보낼 message Protocol을 setting하기
		model.addAttribute("LOGIN_MESSAGE", loginMessage);
		return "user/login_ok";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {

		session.removeAttribute("USER");

		/*
		 * redirect: 로그아웃이 끝나면 web browser의 주소창에 /user/login을 입력하고 Enter를 눌러라
		 */
		return "redirect:/user/login";
	}

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {

		/*
		 * 이 메서드를 요청하는 url은 /user/join 이다
		 * 
		 * return null 을 실행하면 return user/join을 실행한 것과 같다 views/user/join.jsp를 rendering
		 * 하라는 의미
		 */

		return null;
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(UserVO userVO) {

		userService.join(userVO);
		log.debug("관리자인가?" + userVO.toString());

		/*
		 * return "문자열" : Forwarding => views/문자열.jsp를 rendering 하라
		 * 
		 * return "redirect:/url" : Pass, Toss, Redirect => 서버의 localhost:8080/url을 다시
		 * request 하라 => web browse 주소창에 localhost:8080/url을 입력하고 Enter를 누르는 것과 같은 효과
		 */
		return "redirect:/ahn/log/log";
	}

	/*
	 * username 중복검사를 하기 위하여 보통 다음과 같은 요청을 수행한다 /user/idcheck?username=callor
	 * 
	 * fetch(`${rootPath}/user/idcheck/${username.value}`) 만약 username에 callor 입력했으면
	 * /user/idcheck/callor 처럼 요청 URL을 만들어 요청을 수행하라
	 * 
	 * id를 email주소로 사용할 때 PathVarriable로 받을 경우 dot(.) 이후의 문자열을 잘라버리는 현상이 있다 이때는
	 * 정규식(Rexp)을 사용하여 dot(.) 이후 문자열을 포함하여 변수에 저장하도록 변수를 수정 {username:+} 형식으로 지정한다
	 */
	@ResponseBody
	@RequestMapping(value = "/idcheck/{username}", method = RequestMethod.GET)
	public String idcheck(@PathVariable("username") String username) {
		UserVO userVO = userService.findById(username);
		// if(username.equalsIgnoreCase(userVO.getUsername()))
//		if(userVO.getUsername().equalsIgnoreCase(username)) {
//			return "FAIL";
//		} else {
//		return "OK";
//		}
		if (userVO == null) {
			return "OK";
		} else {
			return "FAIL";
		}
	}

	@ResponseBody
	@RequestMapping(value = "/nicknamecheck", method = RequestMethod.GET)
	public String nickcheck(String nickname) {
		UserVO userVO = (UserVO) userService.findByNickName(nickname);
		// if(username.equalsIgnoreCase(userVO.getUsername()))
//	if(userVO.getUsername().equalsIgnoreCase(nickname)) {
//		return "FAIL";
//	} else {
//	return "OK";
//	}
		if (userVO == null) {
			return "OK";
		} else {
			return "FAIL";
		}
	}

	@RequestMapping(value = "/searchID", method = RequestMethod.GET)
	public String searchID() {

		return null;
	}
	@RequestMapping(value = "/searchPASS", method = RequestMethod.GET)
	public String searchPASS() {

		
		return null;
	}

	@RequestMapping(value = "/searchID", method = RequestMethod.POST)
	public String searchID(String email, Model model) {

		UserVO VO = userService.findByEmail(email);
		if (VO == null) {
			model.addAttribute("USERNAME", "NULL");

		} else {
			model.addAttribute("USERNAME", "OK");
			model.addAttribute("USER1", VO);
		}
		return "ahn/user/searchID2";
	}
	
	@RequestMapping(value = "/searchPASS", method = RequestMethod.POST)
	public String searchPASS(String username, String email, Model model) {

		UserVO VO1 = userService.findById(username);
		UserVO VO2 = userService.findByEmail(email);
		
		if (VO1 == null) {
			model.addAttribute("USERPASS2", "NULL");
			return "ahn/user/searchPASS";
		}
		
		if (VO2 == null) {
			model.addAttribute("USERPASS2", "NULL");
			return "ahn/user/searchPASS";
		} 
		if (VO1.getUsername().equals(VO2.getUsername())) {
			
			model.addAttribute("USER", VO1);
			return "ahn/user/searchPASS2";
		} else {
			model.addAttribute("USERPASS2", "NULL");
			
		}
		return "ahn/log/log";
	}
	@RequestMapping(value="/updatePASS", method=RequestMethod.GET)
	public String updatePass(@PathVariable("password") String password, Model model, HttpSession session) {
		UserVO loginUser = (UserVO) session.getAttribute("PASSWORD");
		if(loginUser ==null) {
			model.addAttribute("error","LOGIN_NEED");
			return "redirect:/ahn/log/log";
		}
		return null;
	}
	
	// http://localhost:808/searchPASS/updatePASS
	@RequestMapping(value="/updatePASS", method=RequestMethod.POST)
	public String updatePass(UserVO vo) {
		userService.updatePass(vo);
		
		return "redirect:/";
	}


}
