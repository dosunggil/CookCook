package com.cho.recipe.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

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
public class DosungDetailVO {
	
	
	@JsonProperty("INFO_CAR")
	private String INFO_CAR;// 탄수화물
	@JsonProperty("INFO_PRO")
	private String INFO_PRO;// 단백질
	@JsonProperty("INFO_FAT")
	private String INFO_FAT;// 지방
	@JsonProperty("INFO_NA")
	private String INFO_NA;// 나트륨
	
	private List<String> manual; // 만드는 법
	private List<String> manual_img; // 만드는 법_img
	
	

	
	@JsonProperty("MANUAL01")
	private String MANUAL01 ;
	@JsonProperty("MANUAL02")
	private String MANUAL02 ;
	@JsonProperty("MANUAL03")
	private String MANUAL03 ;
	@JsonProperty("MANUAL04")
	private String MANUAL04 ;
	@JsonProperty("MANUAL05")
	private String MANUAL05 ;
	@JsonProperty("MANUAL06")
	private String MANUAL06 ;
	@JsonProperty("MANUAL07")
	private String MANUAL07 ;
	@JsonProperty("MANUAL08")
	private String MANUAL08 ;
	@JsonProperty("MANUAL09")
	private String MANUAL09 ;
	@JsonProperty("MANUAL10")
	private String MANUAL10 ;
	@JsonProperty("MANUAL11")
	private String MANUAL11 ;
	@JsonProperty("MANUAL12")
	private String MANUAL12 ;
	@JsonProperty("MANUAL13")
	private String MANUAL13 ;
	@JsonProperty("MANUAL14")
	private String MANUAL14 ;
	@JsonProperty("MANUAL15")
	private String MANUAL15 ;
	@JsonProperty("MANUAL16")
	private String MANUAL16 ;
	@JsonProperty("MANUAL17")
	private String MANUAL17 ;
	@JsonProperty("MANUAL18")
	private String MANUAL18 ;
	@JsonProperty("MANUAL19")
	private String MANUAL19 ;
	@JsonProperty("MANUAL20")
	private String MANUAL20 ;
	
	@JsonProperty("MANUAL_IMG01")
	private String MANUAL_IMG01;
	@JsonProperty("MANUAL_IMG02")
	private String MANUAL_IMG02;
	@JsonProperty("MANUAL_IMG03")
	private String MANUAL_IMG03;
	@JsonProperty("MANUAL_IMG04")
	private String MANUAL_IMG04;
	@JsonProperty("MANUAL_IMG05")
	private String MANUAL_IMG05;
	@JsonProperty("MANUAL_IMG06")
	private String MANUAL_IMG06;
	@JsonProperty("MANUAL_IMG07")
	private String MANUAL_IMG07;
	@JsonProperty("MANUAL_IMG08")
	private String MANUAL_IMG08;
	@JsonProperty("MANUAL_IMG09")
	private String MANUAL_IMG09;
	@JsonProperty("MANUAL_IMG10")
	private String MANUAL_IMG10;
	@JsonProperty("MANUAL_IMG11")
	private String MANUAL_IMG11;
	@JsonProperty("MANUAL_IMG12")
	private String MANUAL_IMG12;
	@JsonProperty("MANUAL_IMG13")
	private String MANUAL_IMG13;
	@JsonProperty("MANUAL_IMG14")
	private String MANUAL_IMG14;
	@JsonProperty("MANUAL_IMG15")
	private String MANUAL_IMG15;
	@JsonProperty("MANUAL_IMG16")
	private String MANUAL_IMG16;
	@JsonProperty("MANUAL_IMG17")
	private String MANUAL_IMG17;
	@JsonProperty("MANUAL_IMG18")
	private String MANUAL_IMG18;
	@JsonProperty("MANUAL_IMG19")
	private String MANUAL_IMG19;
	@JsonProperty("MANUAL_IMG20")
	private String MANUAL_IMG20;
	
	

	private List<String> getManual() {
		List<String> menual = new ArrayList<>();
		
		menual.add(0, this.MANUAL01);
		menual.add(1, this.MANUAL02);
		menual.add(2, this.MANUAL03);
		menual.add(3, this.MANUAL04);
		menual.add(4, this.MANUAL05);
		menual.add(5, this.MANUAL06);
		menual.add(6, this.MANUAL07);
		menual.add(7, this.MANUAL08);
		menual.add(8, this.MANUAL09);
		menual.add(9, this.MANUAL10);
		menual.add(10, this.MANUAL11);
		menual.add(11, this.MANUAL12);
		menual.add(12, this.MANUAL13);
		menual.add(13, this.MANUAL14);
		menual.add(14, this.MANUAL15);
		menual.add(15, this.MANUAL16);
		menual.add(16, this.MANUAL17);
		menual.add(17, this.MANUAL18);
		menual.add(18, this.MANUAL19);
		menual.add(19, this.MANUAL20);
		return menual;
		
	}
	protected List<DosungManualVO> manual1; // 만드는 법 + 만드는법 이미지
	
	public List<DosungManualVO> getManual1() {
		List<DosungManualVO> menual = new ArrayList<>();
		DosungManualVO manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL01);
		manualVO.setManual_img(MANUAL_IMG01);
		menual.add(manualVO);
		
		manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL02);
		manualVO.setManual_img(MANUAL_IMG02);
		menual.add(manualVO);
		
		manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL03);
		manualVO.setManual_img(MANUAL_IMG03);
		menual.add(manualVO);
		
		manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL04);
		manualVO.setManual_img(MANUAL_IMG04);
		menual.add(manualVO);
		
		manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL05);
		manualVO.setManual_img(MANUAL_IMG05);
		menual.add(manualVO);
		
		manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL06);
		manualVO.setManual_img(MANUAL_IMG06);
		menual.add(manualVO);
		
		manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL07);
		manualVO.setManual_img(MANUAL_IMG07);
		menual.add(manualVO);
		
		manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL08);
		manualVO.setManual_img(MANUAL_IMG08);
		menual.add(manualVO);
		
		manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL09);
		manualVO.setManual_img(MANUAL_IMG09);
		menual.add(manualVO);
		
		manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL10);
		manualVO.setManual_img(MANUAL_IMG10);
		menual.add(manualVO);
		
		manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL11);
		manualVO.setManual_img(MANUAL_IMG11);
		menual.add(manualVO);
		
		manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL12);
		manualVO.setManual_img(MANUAL_IMG12);
		menual.add(manualVO);
		
		manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL13);
		manualVO.setManual_img(MANUAL_IMG13);
		menual.add(manualVO);
		
		manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL14);
		manualVO.setManual_img(MANUAL_IMG14);
		menual.add(manualVO);
		
		manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL15);
		manualVO.setManual_img(MANUAL_IMG15);
		menual.add(manualVO);
		
		manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL16);
		manualVO.setManual_img(MANUAL_IMG16);
		menual.add(manualVO);
		
		manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL17);
		manualVO.setManual_img(MANUAL_IMG17);
		menual.add(manualVO);
		
		manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL18);
		manualVO.setManual_img(MANUAL_IMG18);
		menual.add(manualVO);
		
		manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL19);
		manualVO.setManual_img(MANUAL_IMG19);
		menual.add(manualVO);
		
		manualVO = new DosungManualVO();
		manualVO.setManual(MANUAL20);
		manualVO.setManual_img(MANUAL_IMG20);
		menual.add(manualVO);
		return menual;
	}

}
