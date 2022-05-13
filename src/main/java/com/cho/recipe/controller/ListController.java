package com.cho.recipe.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ListController {


	@RequestMapping(value = "/listDetail", method = RequestMethod.GET)
	public String List() {

		return "/list/listDetail";
	}
}
