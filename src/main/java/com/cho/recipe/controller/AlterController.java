package com.cho.recipe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AlterController {


	@RequestMapping(value = "/alter", method = RequestMethod.GET)
	public String List() {

		return "/alter/alter";
	}
}
