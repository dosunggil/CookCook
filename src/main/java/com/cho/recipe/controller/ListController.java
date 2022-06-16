package com.cho.recipe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cho.recipe.model.DosungManualVO;
import com.cho.recipe.model.DosungPostVO;
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
		model.addAttribute("CONTENT", contentList);
		return "chang/list/list";
	}

	@RequestMapping(value = "/listDetail", method = RequestMethod.GET)
	public String List() {

		return "/list/listDetail";
	}

	@RequestMapping(value = "/content", method = RequestMethod.GET)
	public String content() {

		return "/chang/content/registerDetail";
	}
	@RequestMapping(value = "/content", method = RequestMethod.POST)
	public String content(DosungManualVO manualVO, DosungPostVO postVO) {

		return "redirect:/list";
	}
	
	
	
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public String insertContent(Model model, @PathVariable() String rcp_seq) {
		
		// detail.jsp 수정 버튼을 누르면 rcp_seq 로 조회해와서 registerDetail(insert 용으로 보내야겠지) 로 값과 함께 보내기
		
		return "/chang/content/insertDetail";
	}
	@RequestMapping(value="/insert/{postseq}", method=RequestMethod.POST)
	public String insertContent(@PathVariable() String rcp_seq) {
		
		//registerDetail(이거를 따로 만들자 ㅠㅠ insert 버튼용으로) 에서 완료를 누르면  
		
		return "redirect:/list";
	}
	
	@RequestMapping(value="/delete/{postseq}")
	public String deleteContent(@PathVariable("postseq") String rcp_seq) {
		
		//  registerDetail(이것도 따로 만들자 ㅜㅜ delete 버튼용으로) 에서 완료를 누르면
		// rcp_seq 로 delete 실행
		
		return "redirect:/list";
	}
}
