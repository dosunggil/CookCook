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

fieldset.form {
	border: 2px solid #ff7f00;
	border-radius: 10px;
	padding: 10px 10px;
	margin: 20px;
	width: 650px;
	font-weight: 900;
	color : #282121;
}

fieldset.form legend {
	color: #ff7f00;
	font-size: 24px;
	text-align: center;
}

.colum-main div:nth-of-type(1) {
	width: 100px;
	line-height: 30px;
}

.form-main .colum-main {
	height: 50px;
	display: flex;
	margin: 30px 0;
}

.colum-main div:nth-of-type(2) input[type=text] {
	width: 500px;
	height: 30px;
}

.form-main .second {
	height: 100px;
}

.form-main .third div:nth-of-type(2) input[type=text] {
	width: 250px;
}

.form-main .fourth div:nth-of-type(2) input[type=text] {
	width: 250px;
}

form button.btn-blue {
	border: none;
	outline: none;
	padding: 12px 16px;
	border-radius: 5px;
	font-size: 16px;
}

button.btn-blue:hover {
	box-shadow: 2px 2px 2px rgba(0, 0, 0, 0.7)
}

.form-main .colum-main:nth-of-type(6) {
	width: 600px;
}

button.btn-blue {
	background-color: #ff7f00;
	color: white;
	margin-left: auto;
}
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<div class="main">
		<form>
			<fieldset class="form">
				<legend>CookCook Contents</legend>
				<div class="form-main">
					<div class="colum-main">
						<div>요리 제목 :</div>
						<div>
							<input type="text" placeholder="요리 제목">
						</div>
					</div>
					<div class="colum-main second">
						<div>요리 내용 :</div>
						<div>
							<textarea rows="7" cols="70"></textarea>
						</div>
					</div>
					<div class="colum-main third">
						<div>칼로리 :</div>
						<div>
							<input type="text" placeholder="칼로리를 대략 적으로 입력해 주세요">
						</div>
					</div>
					<div class="colum-main fourth">
						<div>요리 시간 :</div>
						<div>
							<input type="text" placeholder="요리시간을 대략 적으로 입력해 주세요">
						</div>
					</div>
					<div class="colum-main">
						<div>사진 선택 :</div>
						<div>
							<input type="file">
						</div>
					</div>
					<div class="colum-main">
						<button type="button" class="btn-blue">등록</button>
					</div>
				</div>
			</fieldset>
		</form>
	</div>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>