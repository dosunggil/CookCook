package com.cho.recipe.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cho.recipe.model.DosungDetailVO;
import com.cho.recipe.model.DosungPostVO;
import com.cho.recipe.model.DosungRecipeVO;
import com.cho.recipe.model.UserVO;
import com.cho.recipe.service.DosungPostService;
import com.cho.recipe.service.DosungRecipeService;
import com.cho.recipe.service.DosungUserRecipeService;
import com.cho.recipe.service.DosungUserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(value = "/cho")
@Controller
public class DosungPostController {

	@Autowired
	private DosungPostService post;

	@Autowired
	private DosungUserService dosungUserService;

	@Autowired
	private DosungRecipeService recipeService;

	@Autowired
	private DosungUserRecipeService userRecipeService;

	@RequestMapping(value = "/post/search", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String getRecipes(String title, Model model) {

		String quString = post.queryString("LIST", title);
		List<DosungPostVO> recipeList = new ArrayList<DosungPostVO>();
		recipeList = post.getRecipes(quString);

		List<DosungRecipeVO> llist = new ArrayList<DosungRecipeVO>();
		llist = recipeService.findByNm(title);

		if (recipeList == null) {
			model.addAttribute("RECIPES", llist);

		} else {
			recipeList.addAll(0, llist);
			model.addAttribute("RECIPES", recipeList);
		}

		return "cho/post/search_result";
	}

	@RequestMapping(value = "/post/search_result", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public String getRecipes(String title, String dtls, Model model) {

		String quString = post.queryString("LIST", title);
		List<DosungPostVO> recipeList = post.getRecipes(quString);
		List<DosungRecipeVO> llist = recipeService.findByNm(title.split(" ")[0]);

		model.addAttribute("RECIPES", recipeList);

		return "cho/post/search_result";
	}

	@RequestMapping(value = "/post/{seq}/{nm}/detail", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String detail(@PathVariable("nm") String nm, @PathVariable("seq") long seq, Model model) {

		String quString = post.queryString("LIST", nm);
		List<DosungPostVO> recipeList = post.getRecipes(quString);
		List<DosungDetailVO> detailList = post.getDetail(quString);
		log.debug("받아온 디테일 내용입니다1. " + recipeList.toString());
		log.debug("받아온 디테일 내용입니다2. " + detailList.toString());

		DosungPostVO postVO = null;
		for (DosungPostVO dVO : recipeList) {
			if (dVO.getRCP_SEQ() == seq) {
				postVO = dVO;
				break;
			}
		}
		DosungDetailVO dVO = null;
		dVO = detailList.get(0);

		model.addAttribute("RECIPE", postVO);
		model.addAttribute("DETAIL", dVO);

		return "cho/post/detail";
	}

	@RequestMapping(value = "/recipe/insert", method = RequestMethod.GET)
	public String insert(Model model, HttpSession session) {
		UserVO user = (UserVO) session.getAttribute("USER");
		if (user == null) {
			return "redirect:/ahn/log/log";

		}
		return "chang/content/insertDetail";
	}

	@RequestMapping(value = "/recipe/insert", method = RequestMethod.POST)
	public String insert(DosungRecipeVO recipeVO, HttpSession session, Model model) {
		UserVO userVO = (UserVO) session.getAttribute("USER");
		if (userVO == null) {
			model.addAttribute("error", "LOGIN_NEED");
			return "redirect:/ahn/log/log";
		}

		recipeService.insert(recipeVO);
		userRecipeService.insert(userVO, recipeVO);

		String retStr = String.format("redirect:/cho/user/%s/updateRecipe", userVO.getUsername());
		return retStr;
		// insert 처리를 수행한 후 list 보기 화면으로 전환하라

	}

	@RequestMapping(value = "/recipe/{seq}/insertUpdate", method = RequestMethod.GET)
	public String insertUpdate(@PathVariable("seq") long seq, Model model, HttpSession session) {
		UserVO user = (UserVO) session.getAttribute("USER");
		if (user == null) {
			return "redirect:/ahn/log/log";
		}
		DosungRecipeVO oneVO = recipeService.findById(seq);
		model.addAttribute("postVO", oneVO);
		return "chang/content/insertDetail";
	}

	@RequestMapping(value = "/recipe/{seq}/insertUpdate", method = RequestMethod.POST)
	public String insertUpdate(DosungRecipeVO recipeVO, HttpSession session, Model model) {
		UserVO userVO = (UserVO) session.getAttribute("USER");
		if (userVO == null) {
			model.addAttribute("error", "LOGIN_NEED");
			return "redirect:/ahn/log/log";
		}

		recipeService.update(recipeVO);
		

		String retStr = String.format("redirect:/cho/user/%s/updateRecipe", userVO.getUsername());
		return retStr; // insert 처리를 수행한 후 list 보기 화면으로 전환하라

	}

	@RequestMapping(value = "/{RCP_SEQ}/delete", method = RequestMethod.GET)
	public String delete(@PathVariable("RCP_SEQ") int REC_SEQ, HttpSession session, Model model) {
		UserVO userVO = (UserVO) session.getAttribute("USER");
		if (userVO == null) {
			model.addAttribute("error", "LOGIN_NEED");
			return "redirect:/cho/user/login";
		}

		userRecipeService.delete(REC_SEQ);
		log.debug("삭제 된 숫자"+ userRecipeService.delete(REC_SEQ));
		
		String retStr = String.format("redirect:/cho/user/%s/updateRecipe", userVO.getUsername());
		return retStr;
	}

}
