package com.cho.recipe.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
/*
 * 게시글 테이블
 */
public class ContentVO {
	private String POST_SEQ;
	private String POST_TITLE;
	private String POST_CONTENT;
	private String POST_IMG_BIG;
	private String POST_IMG_SMALL;
	private String MANUAL_SEQ;
	private String POST_STAR;
	private ManualVO manuals;
	private RecipeVO recipeVO; 
	
	

}
