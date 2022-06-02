package com.cho.recipe.service.impl;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cho.recipe.config.DosungPostConfig;
import com.cho.recipe.model.DosungPostVO;
import com.cho.recipe.service.DosungPostService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DosungPostServiceImplV1 implements DosungPostService {

	@Override
	public List<DosungPostVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DosungPostVO findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(DosungPostVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DosungPostVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String queryString(String search) {

		String queryString = DosungPostConfig.API_URL;
		queryString += String.format("/%s", DosungPostConfig.API_ID);
		log.debug("현재 쿼리스트링 : " + queryString);
		
		String encodeSearch = null;
		try {
			encodeSearch = URLEncoder.encode(search, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			log.debug("URL Encoding 오류 발생");
			return null;
		}
		queryString += String.format("/RCP_NM=%s", encodeSearch);
		return queryString;
	}

	@Override
	public String getJsonString(String queryString) {

		URL url = null;
		HttpURLConnection httpCon = null;
		
		try {
			url = new URL(queryString);
			httpCon = (HttpURLConnection) url.openConnection();
			
			httpCon.setRequestMethod("GET");
			
			int resCode = httpCon.getResponseCode();
			
			
			
			
		} catch (MalformedURLException e) {
			log.debug("Query String 문자열 오류");
			return null;
		} catch (IOException e) {
			log.debug("네트워크 연결을 할 수 없음");
			return null;
		}
		
		
		return null;
	}
	
	

}
