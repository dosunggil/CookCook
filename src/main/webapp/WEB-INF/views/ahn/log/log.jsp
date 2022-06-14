<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>

<%@ include file="/WEB-INF/views/include/include_head.jsp"%>
<body>
	<section>
						<c:if test="${error =='LOGIN_NEED'}">
							<div class="w3-red w3-padding-16">로그인이 필요한 서비스입니다.</div>
						</c:if>
						<c:if test="${error =='USERNAME_FAIL'}">
							<div class="w3-red w3-padding-16">ID 가 없음. 회원가입을 먼저 하세요.</div>
						</c:if>
						<c:if test="${error =='PASSWORD_FAIL'}">
							<div class="w3-red w3-padding-16">비밀번호를 확인하세요.</div>
						</c:if>
		<div id="login-form">
			<div class="logobox">
				<img class="logo" src="${rootPath}/resources/images/logo.png">
			</div>
			<div id="login_body">
				<div>
					<form method="POST">
						<input type="text" placeholder="ID" name="username" class="id" />
						<input type="password" placeholder="비밀번호" name="password" />
						<button type="submit" class="login">로그인</button>
					</form>
				</div>
				<div class="log_under">
					<ul>
						<li>비밀번호 찾기</li>
						<li>아이디 찾기</li>
						<li class="signup">회원가입</li>
					</ul>
				</div>
			</div>
		</div>
	</section>
	<nav>
		<ul></ul>
	</nav>
</body>
</html>

