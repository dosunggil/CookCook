package com.cho.recipe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cho.recipe.model.ContentVO;
import com.cho.recipe.service.ContentsService;

@Controller
public class ListController {

	private final ContentsService contentsService;

	public ListController(@Qualifier("contentsServicev1") ContentsService contentsService) {
		this.contentsService = contentsService;
	}

	@RequestMapping(value = "/list")
	public String List(Model model) {
		List<ContentVO> contentList = contentsService.selectAll();
		model.addAttribute("CONTENT", contentList);
		return "chang/list/list";
	}

	@RequestMapping(value = "/listDetail", method = RequestMethod.GET)
	public String List() {

		return "/list/listDetail";
	}

	@RequestMapping(value = "/content", method = RequestMethod.GET)
	public String content() {

		return "/chang/content/registerContent";
	}
}
