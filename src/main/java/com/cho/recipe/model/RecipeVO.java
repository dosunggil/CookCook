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
public class RecipeVO {
	private String rcp_seq;
	private String info_eng;
	private String hash_tag;
	private String rcp_parts_dtls;
}
