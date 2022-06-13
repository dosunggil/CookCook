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
	private String postSeq; // PK
	private String contentsTitle;
	private String contentsArticle;
	private String contentSmallPhoto;
	private String contentBigPhoto;
	private String cookInfoSeq; // 게시글 테이블 FK,요리정보 테이블의 PK
}
