package com.cho.recipe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cho.recipe.model.DosungRecipeVO;
import com.cho.recipe.service.ContentsService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Controller
public class ListController {

	private final ContentsService contentsService;

	public ListController(@Qualifier("contentsServicev1") ContentsService contentsService) {
		this.contentsService = contentsService;
	}

	@RequestMapping(value = "/list")
	public String List(Model model) {
		List<DosungRecipeVO> contentList = contentsService.selectAll();
		log.debug("=".repeat(100));
		log.debug(contentList.toString());
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
