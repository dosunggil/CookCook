package com.cho.recipe.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@RequestMapping(value = {"","/"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		return "home";
	}
	
//	@RequestMapping(value = "/list", method = RequestMethod.GET)
//	public String List() {
//		
//		
//		return "/chang/list/list";
//	}
	
	@RequestMapping(value = "/log", method = RequestMethod.GET)
	public String log() {
		
		
		return "/ahn/log/log";
	}
	
	
}
