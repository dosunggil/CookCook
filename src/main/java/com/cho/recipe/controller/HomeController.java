package com.cho.recipe.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cho.recipe.model.UserVO;
import com.cho.recipe.service.DosungUserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private DosungUserService dosungUserService;
	
	@RequestMapping(value = {"","/"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpSession session) {
		UserVO userVO = (UserVO) session.getAttribute("USER");
		
		if(userVO != null) {
			UserVO realUserVO = dosungUserService.findById(userVO.getUsername());
			session.setAttribute("USER", realUserVO);
		}
		return "home";
	}
	@RequestMapping(value = "/detail")
	public String home() {
		
		
		return "ahn/log/detail";
	}

	
}
