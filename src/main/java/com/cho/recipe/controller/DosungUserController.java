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
import com.cho.recipe.model.DosungUserVO;
import com.cho.recipe.service.DosungRecipeService;
import com.cho.recipe.service.DosungUserRecipeService;
import com.cho.recipe.service.DosungUserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/cho/user")
public class DosungUserController {

	@Autowired
	@Qualifier(QualifierConfig.USER_V2)
	private DosungUserService user;
	
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
	public String join(DosungUserVO vo) {
		log.debug("회원정보 : " + vo.toString());
		user.join(vo);
		return "redirect:/cho/user/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(String error, Model model) {
		model.addAttribute("error", error);
		model.addAttribute("LAYOUT", "LOGIN");
		return null;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(DosungUserVO vo, Model model, HttpSession session) {
		DosungUserVO loginUser = user.findById(vo.getUsername());
		if (loginUser == null) {
			model.addAttribute("error", "USERNAME_FAIL");
			return "redirect:/cho/user/login";
		}
		loginUser = user.login(vo);
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
		DosungUserVO loginUser = (DosungUserVO) session.getAttribute("USER");
		if(loginUser ==null) {
			model.addAttribute("error","LOGIN_NEED");
			return "redirect:/cho/user/login";
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
	
	
	@ResponseBody
	@RequestMapping(value="/idcheck/{username}",method=RequestMethod.GET)
	public String idCheck(@PathVariable("username") String username) {
		DosungUserVO userVO = user.findById(username);
		if(userVO == null) {
			return "OK";
		}
		return "FAIL";
	}
	@ResponseBody
	@RequestMapping(value="/emailcheck",method=RequestMethod.GET)
	public String emailCheck( String email) {
		DosungUserVO userVO = user.findByEmail(email);
		if(userVO == null) {
			return "OK";
		}
		return "FAIL";
	}
}
