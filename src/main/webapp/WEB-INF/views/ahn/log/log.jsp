<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>

<%@ include file="/WEB-INF/views/include/include_head.jsp"%>
<body>
	<section>
		<div id="login-form">
			<div class="logobox">
				<img class="logo" src="${rootPath}/resources/images/logo.png">
			</div>
			<div id="login_body">
				<div>
					<form method="POST">
						<input type="text" placeholder="ID" name="username" class="id" />
						<input type="password" placeholder="비밀번호" name="password" />
						<c:if test="${error =='LOGIN_NEED'}">
							<div class="logre" style="font-size: 12px; color:red;">로그인이 필요한 서비스입니다.</div>
						</c:if>
						<c:if test="${error =='USER_FAIL'}">
							<div class="logre" style="font-size: 12px; color:red;">일치하는 로그인 정보가 없습니다.</div>
						</c:if>
						<button type="submit" class="login">로그인</button>
					</form>
				</div>
				<div class="log_under">
					<ul>
						<li class="search_id">아이디 찾기</li>
						<li class="search_pass">비밀번호 찾기</li>
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

