package com.cho.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogController {
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail() {
		
		return "/log/detail";
	}
	
	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public String mypage() {

		return "/member/mypage";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signUp() {

		return "/signup/signup";
	}
}
