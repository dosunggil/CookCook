package com.cho.recipe.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.cho.recipe.model.DosungRecipeVO;
import com.cho.recipe.model.UserVO;
import com.cho.recipe.persistance.DosungRecipeDao;
import com.cho.recipe.service.DosungRecipeService;

@Service
@Primary
public class DosungRecipeServiceImplV1 implements DosungRecipeService {

	@Autowired
	protected DosungRecipeDao dosungRecipeDaoVv1;
	
	@Override
	public List<DosungRecipeVO> selectAll() {
		
		return dosungRecipeDaoVv1.selectAll();
	}

	


	@Override
	public int update(DosungRecipeVO vo) {
		return dosungRecipeDaoVv1.update(vo);
		
		
	}


	@Override
	public int insert(DosungRecipeVO vo) {
		dosungRecipeDaoVv1.insert(vo);
		return 0;
	}

	@Override
	public List<DosungRecipeVO> findByNm(String title) {
		List<DosungRecipeVO> llist = dosungRecipeDaoVv1.selectAll();
		List<DosungRecipeVO> trueList = new ArrayList<>();
		
		for(DosungRecipeVO vo : llist) {
			if(vo.getRCP_NM().contains(title)) {
				trueList.add(vo);
			}
			
		}
		return trueList;
	}

	




	@Override
	public DosungRecipeVO findById(Long id) {
		return dosungRecipeDaoVv1.findById(id);
	}




	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int delete(int rcp_seq) {
		int ret = dosungRecipeDaoVv1.delete(rcp_seq);
		return ret;
		
	}
	
	

}
