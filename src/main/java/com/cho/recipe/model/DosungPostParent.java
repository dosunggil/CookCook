package com.cho.recipe.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.ToString;
@ToString
public class DosungPostParent {
	
	public String total_count;
	public List<DosungPostVO> row;
	
	@JsonProperty("row")
	public DosungDetailVO row2;

}
