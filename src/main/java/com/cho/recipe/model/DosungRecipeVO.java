package com.cho.recipe.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
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
public class DosungRecipeVO extends DosungPostVO{
	
	/*
	 * tbl_recipe 테이블과 연결
	 * 관계테이블 아님!!
	 */
	
	@JsonProperty("RCP_SEQ")
	private String RCP_SEQ;// 일련번호

	@JsonProperty("RCP_NM")
	private String RCP_NM;// 메뉴명

	@JsonProperty("INFO_ENG")
	private String INFO_ENG;// 열량

	@JsonProperty("HASH_TAG")
	private String HASH_TAG;// 해쉬태그

	@JsonProperty("ATT_FILE_NO_MK")
	private String ATT_FILE_NO_MK;// 이미지경로(대)

	@JsonProperty("RCP_PARTS_DTLS")
	private String RCP_PARTS_DTLS;// 재료정보

	private String rcp_content;//	nVARCHAR2(1000)		not null		,

	private int POST_STAR;// 별점
	
	


}
