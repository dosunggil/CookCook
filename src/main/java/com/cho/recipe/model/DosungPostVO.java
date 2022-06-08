package com.cho.recipe.model;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class DosungPostVO {

//	public DosungPostVO(String rCP_PARTS_DTLS) {
//		RCP_PARTS_DTLS = rCP_PARTS_DTLS;
//	}

	@JsonProperty("RCP_SEQ")
	private String RCP_SEQ;// 일련번호

	@JsonProperty("RCP_NM")
	private String RCP_NM;// 메뉴명

	@JsonProperty("INFO_ENG")
	private String INFO_ENG;// 열량

	@JsonProperty("HASH_TAG")
	private String HASH_TAG;// 해쉬태그

	@JsonProperty("ATT_FILE_NO_MAIN")
	private String ATT_FILE_NO_MAIN;// 이미지경로(소)

	@JsonProperty("ATT_FILE_NO_MK")
	private String ATT_FILE_NO_MK;// 이미지경로(대)

	@JsonProperty("RCP_PARTS_DTLS")
	private String RCP_PARTS_DTLS;// 재료정보



	private int POST_STAR;// 별점

}
