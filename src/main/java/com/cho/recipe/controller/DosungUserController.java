package com.cho.recipe.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cho.recipe.config.QualifierConfig;
import com.cho.recipe.model.DosungRecipeVO;
import com.cho.recipe.model.DosungUserRecipeVO;
import com.cho.recipe.model.UserVO;
import com.cho.recipe.service.DosungRecipeService;
import com.cho.recipe.service.DosungUserRecipeService;
import com.cho.recipe.service.DosungUserService;
import com.cho.recipe.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/cho/user")
public class DosungUserController {

	@Autowired
	@Qualifier(QualifierConfig.USER_V2)
	private DosungUserService dosungUserService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private DosungRecipeService dosungRcpService;
	@Autowired
	private DosungUserRecipeService userRecipeService;
	

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join(Model model) {
		model.addAttribute("LAYOUT", "JOIN");
		return null;
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(UserVO vo) {
		log.debug("회원정보 : " + vo.toString());
		dosungUserService.join(vo);
		return "redirect:/cho/user/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(String error, Model model) {
		model.addAttribute("error", error);
		model.addAttribute("LAYOUT", "LOGIN");
		return null;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(UserVO vo, Model model, HttpSession session) {
		UserVO loginUser = dosungUserService.findById(vo.getUsername());
		if (loginUser == null) {
			model.addAttribute("error", "USERNAME_FAIL");
			return "redirect:/cho/user/login";
		}
		loginUser = dosungUserService.login(vo);
		if (loginUser == null) {
			model.addAttribute("error", "PASSWORD_FAIL");
			return "redirect:/cho/user/login";
		}
		session.setAttribute("USER", loginUser);
		return "redirect:/";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("USER");

		return "redirect:/";
	}

	@RequestMapping(value="/mypage",method=RequestMethod.GET)
	public String mypage(Model model, HttpSession session) {
		UserVO loginUser = (UserVO) session.getAttribute("USER");
		if(loginUser ==null) {
			model.addAttribute("error","LOGIN_NEED");
			return "redirect:/ahn/log/log";
		}
		model.addAttribute("LAYOUT","MYPAGE");
		
			List<DosungUserRecipeVO> URlist = userRecipeService.findByUserName(loginUser.getUsername());
			
			for(DosungUserRecipeVO VO : URlist) {
				
				long seq = VO.getB_seq();
				DosungRecipeVO RcpVO = dosungRcpService.findById(seq);
				
				VO.setRecipe(RcpVO);
			}
			log.debug("디테일을볼까?22" + URlist.toString());
			
			model.addAttribute("MY_RECIPES",URlist);
		return null;
	}
	@RequestMapping(value="/{username}/update", method=RequestMethod.GET)
	public String update(@PathVariable("username") String username, Model model, HttpSession session) {
		UserVO loginUser = (UserVO) session.getAttribute("USER");
		if(loginUser ==null) {
			model.addAttribute("error","LOGIN_NEED");
			return "redirect:/ahn/log/log";
		}
		
		UserVO realUser = dosungUserService.findById(username);
		model.addAttribute("USER",realUser);
		return "cho/user/update";
	}
	@RequestMapping(value="/{username}/update", method=RequestMethod.POST)
	public String update(UserVO userVO) {
		
		userService.update(userVO);
		String retStr = String.format("redirect:/cho/user/%s/update", userVO.getUsername());
		return retStr;
	}
	
	@RequestMapping(value="/updatePass", method=RequestMethod.POST)
	public String updatePass(UserVO vo) {
		
		return  "redirect:/cho/user/mypage";
	}

	
	
	
	
	@ResponseBody
	@RequestMapping(value="/idcheck/{username}",method=RequestMethod.GET)
	public String idCheck(@PathVariable("username") String username) {
		UserVO userVO = dosungUserService.findById(username);
		if(userVO == null) {
			return "OK";
		}
		return "FAIL";
	}
	@ResponseBody
	@RequestMapping(value="/emailcheck",method=RequestMethod.GET)
	public String emailCheck( String email) {
		UserVO userVO = dosungUserService.findByEmail(email);
		if(userVO == null) {
			return "OK";
		}
		return "FAIL";
	}
}

