package com.cho.recipe.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class DosungManualVO {

	/*
	 * tbl_manual 테이블과 연결
	 */
	
	private long manual_seq;//		VARCHAR2(10)			PRIMARY KEY	,
	private long post_seq	;//	VARCHAR2(10)		NOT NULL		,
	private String manual_num		;//NUMBER(2)

	
	
	private String manual		  ;//  nVARCHAR2(200)				,
	private String manual_img   ;//   nVARCHAR2(500)				,
}
