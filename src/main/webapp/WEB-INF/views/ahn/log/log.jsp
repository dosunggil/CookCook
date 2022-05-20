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
					<form>
						<input type="text" placeholder="ID" name="m_name" class="id" /> <input
							type="password" placeholder="비밀번호" name="m_password" />
						<div>
							<p class="show">
								아이디(로그인 전용 아이디) 또는 비밀번호를 잘못 입력했습니다.<br /> 입력하신 내용을 다시 확인해주세요.
							</p>
						</div>
						<button type="button" class="login">로그인</button>
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

