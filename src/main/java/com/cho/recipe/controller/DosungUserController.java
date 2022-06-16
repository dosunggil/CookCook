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



	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(String error, Model model) {
		model.addAttribute("error", error);
		model.addAttribute("LAYOUT", "LOGIN");
		return "ahn/log/log";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(UserVO vo, Model model, HttpSession session) {
		return dosungUserService.loggin(vo, model, session);
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute("USER");

		return "redirect:/";
	}

	@RequestMapping(value = "/{username}/update", method = RequestMethod.GET)
	public String update(@PathVariable("username") String username, Model model, HttpSession session) {
		String str = dosungUserService.usercheck(username, model, session);
		if (str != null)	return str;
		return "cho/user/update";
	}

	@RequestMapping(value = "/{username}/update", method = RequestMethod.POST)
	public String update(UserVO userVO) {

		userService.update(userVO);
		String retStr = String.format("redirect:/cho/user/%s/update", userVO.getUsername());
		return retStr;
	}

	@RequestMapping(value = "/{username}/updateRecipe", method = RequestMethod.GET)
	public String updateRecipe(@PathVariable("username") String username, Model model, HttpSession session) {
		String str = dosungUserService.usercheck(username, model, session);
		if (str != null)	return str;
		List<DosungUserRecipeVO> URlist = userRecipeService
				.findByUserName(((UserVO) session.getAttribute("USER")).getUsername());
		for (DosungUserRecipeVO VO : URlist) {
			long seq = VO.getB_seq();
			DosungRecipeVO RcpVO = dosungRcpService.findById(seq);
			VO.setRecipe(RcpVO);
		}
		model.addAttribute("MY_RECIPES", URlist);
		return "cho/user/updateRecipe";
	}

	@RequestMapping(value = "/{username}/updateRecipe", method = RequestMethod.POST)
	public String updateRecipe(UserVO userVO) {
		userService.update(userVO);
		String retStr = String.format("redirect:/cho/user/%s/update", userVO.getUsername());
		return retStr;
	}

	@ResponseBody
	@RequestMapping(value = "/idcheck/{username}", method = RequestMethod.GET)
	public String idCheck(@PathVariable("username") String username) {
		UserVO userVO = dosungUserService.findById(username);
		if (userVO == null) {
			return "OK";
		}
		return "FAIL";
	}

	@ResponseBody
	@RequestMapping(value = "/emailcheck", method = RequestMethod.GET)
	public String emailCheck(String email) {
		UserVO userVO = dosungUserService.findByEmail(email);
		if (userVO == null) {
			return "OK";
		}
		return "FAIL";
	}
	@RequestMapping(value = "/searchID", method = RequestMethod.GET)
	public String searchID() {
		return "ahn/user/searchID";
	}
	@RequestMapping(value = "/searchPASS", method = RequestMethod.GET)
	public String searchPASS() {
		return "ahn/user/searchPASS";
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
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "ahn/user/join";
	}

	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(UserVO userVO) {
		userService.join(userVO);
		return "redirect:/ahn/log/log";
	}

}
