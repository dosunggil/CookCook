<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<link rel="stylesheet" href="${rootPath}/resources/css/reset.css" />
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>
<link rel="stylesheet" href="${rootPath}/resources/css/list.css" />
<style>
div.main {
	width: 1130px;
	height: 100%;
	margin: 0 auto;
	display: flex;
	flex-direction: column;
}

form.form-main {
	width: 1130px;
	flex-direction: column;
	display: flex;
}

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
	padding: 12px 16px;
	border-radius: 5px;
	font-size: 16px;
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

button.btn-check {
	margin-left: 10px;
	font-size: 14px;
}

fieldset.form legend {
	color: #ff7f00;
	font-size: 24px;
	text-align: center;
}
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<div class="main">
		<form>
			<fieldset class="form">
				<legend>Privacy</legend>
				<div class="form-main">
					<div class="colum-main id">
						<div>아이디 :</div>
						<div>
							<input type="text" value="아이디" readonly>
						</div>
					</div>
					<div class="colum-main password">
						<div>비밀번호 :</div>
						<div>
							<input type="password" placeholder="변경할 비밀번호를 입력해주세요">
						</div>
					</div>
					<div class="colum-main password2">
						<div>비밀번호 확인 :</div>
						<div>
							<input type="password" placeholder="변경할 비밀번호를 입력해주세요">
						</div>
						<div class="check">checking....(빨강) checked(검정)</div>
					</div>
					<div class="colum-main name">
						<div>닉네임 :</div>
						<div>
							<input type="text" value="닉네임" readonly>
						</div>
					</div>
					<div class="colum-main btn">
						<button type="button" class="btn-blue">update</button>
					</div>
				</div>
			</fieldset>
		</form>
	</div>

	<div class="main">
		<fieldset class="form">
			<legend>I posted</legend>
			<c:forEach var="i" begin="1" end="3">

				<section class="section-colum">
					<article class="img-article">
						<img src="${rootPath}/resources/images/steak.jpg">
					</article>
					<div class="div-article">
						<article class="title-article">스테이크</article>
						<article class="content-article">센 불에서 튀기듯이 구워 겉은 바삭바삭
							육즙이 속에 가두어져 속은 촉촉. 이건 당연히 맛이 없을 수가 없겠죠~거기에 홀그레인 머스타드는 고기 특유의 느끼함을
							잡아주고. 요새는 마트에서 판매하는 소스도 맛있게 잘 나와서 넘 맛있는 한 끼네요.</article>
						<article class="stars-article">4</article>
					</div>
				</section>

			</c:forEach>
		</fieldset>
	</div>

	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>