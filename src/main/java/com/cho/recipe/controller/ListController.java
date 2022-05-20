package com.cho.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ListController {


	@RequestMapping(value = "/listDetail", method = RequestMethod.GET)
	public String List() {

		return "/list/listDetail";
	}
	
	@RequestMapping(value = "/alter", method = RequestMethod.GET)
	public String alter() {

		return "/alter/alter";
	}
	
	@RequestMapping(value = "/content", method = RequestMethod.GET)
	public String content() {

		return "/content/registerContent";
	}
}
