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

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(value = "/cho")@Controller
public class DosungPostController {

	@Autowired
	private DosungPostService post;
	
	
	@Autowired 
	private DosungRecipeService recipeService;
	
	@Autowired
	private DosungUserRecipeService userRecipeService;
	
	

	@RequestMapping(value = "/post/search", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String getRecipes(String title, Model model) {
		/*
		 * title 이 검색어
		 */
		String quString = post.queryString("LIST", title);
		List<DosungPostVO> recipeList = new ArrayList<DosungPostVO>();
		recipeList = post.getRecipes(quString);
		
		List<DosungRecipeVO> llist = new ArrayList<DosungRecipeVO>();
		llist = recipeService.findByNm(title);
		
		if(recipeList == null) {
			model.addAttribute("RECIPES", llist);
			
		} else {
		recipeList.addAll(0,llist);
			model.addAttribute("RECIPES", recipeList);
		}

		return "cho/post/search_result";
	}

	@RequestMapping(value = "/post/search_result", method = RequestMethod.POST , produces = "application/json;charset=UTF-8")
	public String getRecipes(String title,String dtls, Model model) {

		/*
		 * title 이 검색어
		 */
		String quString = post.queryString("LIST", title);
		List<DosungPostVO> recipeList = post.getRecipes(quString);
		List<DosungRecipeVO> llist = recipeService.findByNm(title.split(" ")[0]);
		
		//recipeList.addAll(llist);

		model.addAttribute("RECIPES", recipeList);

		return "cho/post/search_result";
	}

	@RequestMapping(value = "/post/{seq}/{nm}/detail", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public String detail(@PathVariable("nm") String nm, @PathVariable("seq")  long seq, Model model) {

		
	/*
	 * String queryString = naver.queryString("LIST", isbn);
	 * String queryString = naver.queryString("DETAIL", isbn);
	 * 
	 * 이렇게 해서 두 경우로 나누자!
	 * NaverServiceImplV1 getNaver 참고 !!
	 */
		String quString = post.queryString("LIST", nm);
		List<DosungPostVO> recipeList = post.getRecipes(quString);
		List<DosungDetailVO> detailList = post.getDetail(quString);
//		log.debug("받아온 디테일 내용입니다2. " + detailList.toString());
		
		DosungPostVO postVO = null;
		for(DosungPostVO dVO : recipeList) {
			if(dVO.getRCP_SEQ() == seq){
				postVO = dVO;
				break;
			}
		}
		DosungDetailVO dVO  = null;
		dVO = detailList.get(0);
		
//		DosungDetailVO detailVO = null;
//		detailVO = detaill.splitDetail(dVO);
		
		model.addAttribute("RECIPE", postVO);
		model.addAttribute("DETAIL",dVO);
		
//		@ResponseBody
//		@RequestMapping(value="/{isbn}/book",method=RequestMethod.GET)
//		public BookVO book(@PathVariable("isbn") String isbn) {
//			
//			String queryString = naver.queryString("BOOK", isbn);
//			List<Object> bookList = naver.getNaver(queryString);
//			
//			BookVO bookVO = (BookVO) bookList.get(0);
//			return bookVO;
//			
//		}
		
		
		
		/*
		 * open api 에서는 findbyid 가 아닌 다른 방법을 찾아야한다.
		 */
		/*
		 * DosungPostVO postVO = post.findById(seq);
		 * model.addAttribute("RECIPE",postVO);
		 */
		//log.debug("결과는? " + vo.toString());

		return "cho/post/detail";
	}
	
	@RequestMapping(value="/recipe/insert",method=RequestMethod.GET)
	public String insert(Model model,HttpSession session) {
		model.addAttribute("LAYOUT","POST-INPUT");
		
		UserVO userVO = (UserVO) session.getAttribute("USER");
		if(userVO == null) {
			model.addAttribute("error","LOGIN_NEED");
			return "redirect:/cho/user/login";
		}
		return null;
	}
	
	@RequestMapping(value="/recipe/insert",method=RequestMethod.POST)
	public String insert(DosungRecipeVO recipeVO,HttpSession session, Model model) {
		
		log.debug("레피시 정보 : " + recipeVO.toString());
		UserVO userVO = (UserVO) session.getAttribute("USER");
		if(userVO == null) {
			model.addAttribute("error","LOGIN_NEED");
			return "redirect:/cho/user/login";
		}
		recipeService.insert(recipeVO);
		userRecipeService.insert(userVO, recipeVO);
	
		// insert 처리를 수행한 후 list 보기 화면으로 전환하라
		return "redirect:/cho/user/mypage";
		
	}
	


}
