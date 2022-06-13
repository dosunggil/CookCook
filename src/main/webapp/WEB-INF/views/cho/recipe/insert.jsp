<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>

<style>
	#username {
	display: none;}
</style>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<h1>여기는 레시피 등록페이지</h1>
	
	<form method="POST" class="w3-container">
		<input class="w3-input" name="post_user" id="username"  value="${USER.username}">
		<input class="w3-input" name="post_title" id="title" placeholder="제목" value="${RECIPE.post_title}">
		
		<input class="w3-input" name="post_content" id="content" placeholder="요리를 간략하게 설명하세요." value="${RECIPE.post_content}">
		
		<textarea  class="w3-input" rows="10" cols=""></textarea>
	<button class="w3-button w3-indigo btn-save" type="button">저장</button>
</form>
</body>
</html>