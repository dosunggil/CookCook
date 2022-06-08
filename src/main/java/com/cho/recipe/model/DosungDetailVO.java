package com.cho.recipe.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;

import lombok.ToString;

import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;

import lombok.Setter;

import lombok.Getter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class DosungDetailVO {
	
	
	
	
	
	@JsonProperty("INFO_CAR")
	private String INFO_CAR;// 탄수화물
	@JsonProperty("INFO_PRO")
	private String INFO_PRO;// 단백질
	@JsonProperty("INFO_FAT")
	private String INFO_FAT;// 지방
	@JsonProperty("INFO_NA")
	private String INFO_NA;// 나트륨
	
	private String[] manual; // 만드는 법
	private String[] manual_img; // 만드는 법_img
	
}
