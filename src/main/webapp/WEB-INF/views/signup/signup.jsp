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
<style>
div.main {
	width: 1130px;
	height: 100vh;
	margin: 0 auto;
	display: flex;
	flex-direction: column;
}

form.form-main {
	width: 1130px;
	flex-direction: column;
	display: flex;
}
.main form {
margin: 150px auto;}
fieldset.form {
	border: 2px solid #ff7f00;
	border-radius: 10px;
	padding: 10px 10px;
	margin: 20px;
	width: 650px;
	font-weight: 900;
	color: #282121;
}

fieldset.form legend {
	color: #ff7f00;
	font-size: 24px;
	text-align: center;
}

.colum-main div:nth-of-type(1) {
	width: 150px;
	line-height: 30px;
}

.form-main .colum-main {
	height: 50px;
	display: flex;
	margin: 30px 0;
	align-items: center;
}

.form-main .id div:nth-of-type(2) input[type=text] {
	width: 250px;
	height: 30px;
}

.form-main .password div:nth-of-type(2) input[type=password] {
	width: 250px;
	height: 30px;
}

.form-main .password2 div:nth-of-type(2) input[type=password] {
	width: 250px;
	height: 30px;
}

.form-main .name div:nth-of-type(2) input[type=text] {
	width: 250px;
	height: 30px;
}

.form-main .password2 div:nth-of-type(3).check {
	padding-top: 8px;
	padding-left: 2px;
}

form button.btn-blue {
	border: none;
	outline: none;
	border-radius: 5px;
	font-size: 16px;
	padding: 12px 16px;
}

form button.checkid {
	border: none;
	outline: none;
	padding: 12px 16px;
	border-radius: 5px;
	font-size: 16px;
}

button.btn-blue:hover {
	box-shadow: 2px 2px 2px rgba(0, 0, 0, 0.7)
}

.form-main .colum-main:nth-of-type(5) {
	width: 600px;
}

button.btn-blue {
	background-color: #ff7f00;
	color: white;
	margin-left: auto;
}

form button.btn-blue.btn-check {
	margin-left: 10px;
	padding: 6px 8px;
}

.colum-main.password2 .check {
	color: red;
	margin-left: 5px;
}
</style>
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