package com.cho.recipe.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cho.recipe.model.DosungPostVO;
import com.cho.recipe.service.DosungPostService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(value = "/cho")
@Controller
public class DosungPostController {

	private final DosungPostService post;

	public DosungPostController(DosungPostService dosungP) {
		this.post = dosungP;
	}

	@RequestMapping(value = "/search_result", method = RequestMethod.GET)
	public String getRecipes() {
		return "cho/search_result";
	}

	@RequestMapping(value = "/search_result", method = RequestMethod.POST)
	public String getRecipes(String title,String dtls, Model model) {

		String quString = post.queryString(title, dtls);
		List<DosungPostVO> recipeList = post.getRecipes(quString);

		model.addAttribute("RECIPES", recipeList);

		log.debug("쿼리스트링" + quString);

		return null;
	}

	@RequestMapping(value = "/{nm}/detail", method = RequestMethod.GET)
	public String detail(@PathVariable("nm") String nm, String dtls, Model model) {

		String quString = post.queryString(nm, dtls);
		List<DosungPostVO> recipeList = post.getRecipes(quString);

		model.addAttribute("RECIPE", recipeList);
		/*
		 * open api 에서는 findbyid 가 아닌 다른 방법을 찾아야한다.
		 */
		/*
		 * DosungPostVO postVO = post.findById(seq);
		 * model.addAttribute("RECIPE",postVO);
		 */
		log.debug("결과는? " + recipeList.toString());

		return "cho/detail";
	}

}