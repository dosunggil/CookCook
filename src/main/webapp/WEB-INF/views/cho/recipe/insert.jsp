<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<h1>여기는 레시피 등록페이지</h1>
	
	<form method="POST" class="w3-container">
		<input class="w3-input" name="username" id="username"  value="${USER.username}" hidden="hidden">
		<input class="w3-input" name="RCP_NM" id="title" placeholder="제목" value="${RECIPE.RCP_NM}">
		
		<input class="w3-input" name= "rcp_content" id="content" placeholder="요리를 간략하게 설명하세요." value="${RECIPE.recipe_content}">
		<input class="w3-input" name="ATT_FILE_NO_MK" id="img" placeholder="이미지주소." value="${RECIPE.ATT_FILE_NO_MK}">
		<input class="w3-input" name="INFO_ENG" id="eng" placeholder="열량." value="${RECIPE.INFO_ENG}">
		<input class="w3-input" name="RCP_PARTS_DTLS" id="dtls" placeholder="재료정보." value="${RECIPE.RCP_PARTS_DTLS}">
		<input class="w3-input" name="HASH_TAG" id="hashtag" placeholder="해시태그." value="${RECIPE.HASH_TAG}">
		
		<!-- <textarea  class="w3-input" rows="10" cols=""></textarea> -->
		<button class="w3-button w3-indigo btn-save-recipe" type="button">저장</button>
	</form>
</body>
</html>