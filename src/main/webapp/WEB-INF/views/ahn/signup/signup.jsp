<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>retisterContent</title>
<link rel="stylesheet" href="${rootPath}/resources/css/reset.css" />
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<div class="main">
		<form>
			<fieldset class="form">
				<legend>Sign Up</legend>
				<div class="form-main">
					<div class="colum-main id">
						<div>아이디 :</div>
						<div>
							<input type="text" placeholder="아이디를 입력해주세요">
						</div>
						<div>
							<button type="button" class="btn-blue btn-check">중복확인</button>
						</div>
					</div>
					<div class="colum-main password">
						<div>비밀번호 :</div>
						<div>
							<input type="password" placeholder="비밀번호를 입력해주세요">
						</div>
					</div>
					<div class="colum-main password2">
						<div>비밀번호 확인 :</div>
						<div>
							<input type="password" placeholder="비밀번호를 입력해주세요">
						</div>
						<div class="check">checking....</div>
					</div>
					<div class="colum-main name">
						<div>닉네임 :</div>
						<div>
							<input type="text" placeholder="닉네임을 입력해주세요">
						</div>
						<div>
							<button type="button" class="btn-blue btn-check">중복확인</button>
						</div>
					</div>
					<div class="colum-main btn">
						<button type="button" class="btn-blue">Sign Up</button>
					</div>
				</div>
			</fieldset>
		</form>
	</div>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>