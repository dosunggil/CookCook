package com.cho.recipe.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cho.recipe.model.DosungManualVO;
import com.cho.recipe.model.DosungPostVO;
import com.cho.recipe.model.DosungRecipeVO;
import com.cho.recipe.model.UserVO;
import com.cho.recipe.service.ContentsService;
import com.cho.recipe.service.DosungPostService;
import com.cho.recipe.service.DosungRecipeService;
import com.cho.recipe.service.DosungUserService;
import com.cho.recipe.service.ManualService;

import lombok.extern.slf4j.Slf4j;


/**
 * Handles requests for the application home page.
 */
@Slf4j
@Controller
public class HomeController {

	
	@Autowired
	private DosungPostService post;
	@Autowired
	private DosungRecipeService recipeService;
	
	private final ContentsService contentsService;
	private final ManualService manualService;
	public HomeController(@Qualifier("contentsServicev1") ContentsService contentsService,
			@Qualifier("manualServicev1") ManualService manualService) {
		this.contentsService = contentsService;
		this.manualService = manualService;
	}

	@Autowired
	private DosungUserService dosungUserService;
	
	@RequestMapping(value = {"","/"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpSession session) {
		UserVO userVO = (UserVO) session.getAttribute("USER");
		if(userVO != null) {
			UserVO realUserVO = dosungUserService.findById(userVO.getUsername());
			session.setAttribute("USER", realUserVO);
		}
		List<DosungPostVO> recipeList = new ArrayList<DosungPostVO>();
		recipeList = post.getAllRecipes();
		List<DosungRecipeVO> llist = new ArrayList<DosungRecipeVO>();
		llist = recipeService.selectAll();
		log.debug("API 리스트 {}", recipeList);
		log.debug("DB 리스트 {}", llist);
		recipeList.addAll(0,llist);
		int intRan1 = (int) (Math.random()* recipeList.size()) ;
		int intRan2 = (int) (Math.random()* recipeList.size()) ;
		int intRan3 = (int) (Math.random()* recipeList.size()) ;
		
		List<DosungPostVO> randList = new ArrayList<DosungPostVO>();
		randList.add(recipeList.get(intRan1));
		randList.add(recipeList.get(intRan2));
		randList.add(recipeList.get(intRan3));
		model.addAttribute("RECIPES", randList);
		return "home";
	}
	@RequestMapping(value = "/detail/{postseq}", method=RequestMethod.GET)
	public String home(@PathVariable("postseq") long rcp_seq, Model model) {
		DosungPostVO postVO  = contentsService.findByPostSeq(rcp_seq);
		List<DosungManualVO> manuals = manualService.findByRecipeID(rcp_seq);
	
		model.addAttribute("postVO", postVO);
		model.addAttribute("MANUAL", manuals);
		log.debug(manuals.toString());
		
		return "ahn/log/detail";
	}

	
}
