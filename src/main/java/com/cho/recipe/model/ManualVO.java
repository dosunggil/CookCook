package com.cho.recipe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ManualVO {
	private String manual_seq;
	private String rcp_seq;
	private String manual;
	private String manual_img;
	private String manual_num;
}
