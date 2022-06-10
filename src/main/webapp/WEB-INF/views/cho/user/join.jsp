<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>
<style>

</style>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	
	<form method="post" class="w3-container w3-card-4 join">

	<h2>회원가입</h2>
	<label>User Name(ID)</label>
	<input id="username" name="username" placeholder="USERNAME" class="w3-input w3-border">
	<div class="w3-container error"></div>
	
	
	<label>비밀번호</label>
	<input id="password" name="password" placeholder="PASSWORD"class="w3-input w3-border">
	<div class="w3-container error"></div>
	
	<label>비밀번호 확인</label>
	<input id="re_password" name="re_password" placeholder="RE_PASSWORD"class="w3-input w3-border">
	<div class="w3-container error"></div>
	
	<label>이메일</label>
	<input id="email" name="email" placeholder="EMAIL"class="w3-input w3-border">
	<div class="w3-container error"></div>
	
	<label>이름</label>
	<input id="name" name="name" placeholder="NAME"class="w3-input w3-border">
	<div class="w3-container error"></div>
	
	<label>닉네임</label>
	<input id="nickname" name="nickname" placeholder="NICKNAME"class="w3-input w3-border">
	<div class="w3-container error"></div>
	
	<button id="btn-join" class="w3-button w3-blue" type="button">회원가입</button>

</form>
</body>
</html>