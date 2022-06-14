package com.cho.recipe.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cho.recipe.model.UserVO;
import com.cho.recipe.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping(value="ahn/log")
public class LogController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail() {
		
		return "/ahn/log/detail";
	}
	
	
	@RequestMapping(value = "log", method = RequestMethod.GET)
	public String login(String error, Model model) {
		model.addAttribute("error", error);
		model.addAttribute("LAYOUT", "LOGIN");
		return null;
	}
	
	
	
	
	@RequestMapping(value = "/log", method = RequestMethod.POST)
	public String login(UserVO vo, Model model, HttpSession session) {
		UserVO loginUser = userService.findById(vo.getUsername());
		if (loginUser == null) {
			
			log.debug("아이디 불일치");
			model.addAttribute("error", "USERNAME_FAIL");
			return "redirect:/ahn/log/log";
		}
		loginUser = userService.login(vo);
		if (loginUser == null) {
			log.debug("패스워드 불일치");
			model.addAttribute("error", "PASSWORD_FAIL");
			return "redirect:/ahn/log/log";
		}
		session.setAttribute("USER", loginUser);
		return "redirect:/";
	}
}
