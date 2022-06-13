package com.cho.recipe.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * 유저 정보 + 레시피 정보 =>> 게시글 정보
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class DosungRecipeVO {
	
	/*
	 * tbl_recipe 테이블과 연결
	 */

	private String recipe_seq	;//	VARCHAR2(10)			PRIMARY KEY	,
	private String recipe_title;//		nVARCHAR2(125)		not null		,
	private String recipe_content;//	nVARCHAR2(1000)		not null		,
	private String recipe_img;//		VARCHAR2(500)				,
	private String recipe_eng	;//	    NUMBER(5)				,
	private String recipe_dtls;//		nVARCHAR2(1000)				,
	private String recipe_hashtag;//	    nVARCHAR2(200)				,


}
