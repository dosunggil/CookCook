<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>retisterContent</title>
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<main class="mainA">
		<div class="formA">
			<form>
				<fieldset>
					<legend>Sign Up</legend>
					<div class="form-mainA">
						<div class="colum-mainA name">
							<div>이름</div>
							<div>
								<input type="text">
							</div>
						</div>
						<div class="colum-mainA id">
							<div>아이디</div>
							<div>
								<input type="text">
							</div>
							<div>
								<button type="button" class="btn-blueA btn-check">중복확인</button>
							</div>
						</div>
						<div class="colum-mainA nickname">
							<div>닉네임</div>
							<div>
								<input type="text">
							</div>
							<div>
								<button type="button" class="btn-blueA btn-checkA">중복확인</button>
							</div>
						</div>
						<div class="colum-mainA password">
							<div>비밀번호</div>
							<div>
								<input type="password">
							</div>
						</div>
						<div class="colum-mainA password2">
							<div>비밀번호 확인</div>
							<div>
								<input type="password">
							</div>
						</div>
						<div class="colum-mainA-btn">
							<div>
								<button type="button" class="btn-sign">가입하기</button>
							</div>
						</div>
					</div>
				</fieldset>
			</form>
		</div>
	</main>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>