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
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class DosungPostVO {

	private String RCP_SEQ;//	일련번호
	private String RCP_NM;//	메뉴명
	private String INFO_ENG;//	열량
	private String HASH_TAG;//	해쉬태그
	private String ATT_FILE_NO_MAIN;//	이미지경로(소)
	private String ATT_FILE_NO_MK;//	이미지경로(대)
	private String RCP_PARTS_DTLS;//	재료정보
	private String POST_STAR;// 별점

}
