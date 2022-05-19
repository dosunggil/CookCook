package com.cho.recipe.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyPageController {


	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public String List() {

		return "/member/mypage";
	}
}
