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
main {
	width: 1130px;
	height: 100%;
	margin: 0px auto;
}

form.form-main {
	width: 1130px;
	display: flex;
	flex-direction: column;
}

.form-main.colum-main {
	height: 50px;
	display: flex;
}

form button {
	border: none;
	outline: none;
	padding: 12px 16px;
	border-radius: 5px;
	font-size: 16px;
}

button:hover {
	box-shadow: 2px 2px 2px rgba(0, 0, 0, 0.7)
}

button.btn-blue {
	background-color: blue;
	color: white;
}
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<main>
		<form>
			<div class="form-main">
				<div class="colum-main">
					<div>요리 제목 :</div>
					<input type="text" placeholder="요리 제목">
				</div>
				<div class="colum-main">
					<div>요리 내용 :</div>
					<input type="text" placeholder="요리 내용">
				</div>
				<div class="colum-main">
					<div>재료를 선택 :</div>
					<input type="text" placeholder="요리 내용">
				</div>
				<div class="colum-main">
					<div>사진 선택 :</div>
					<input type="text" placeholder="요리 내용">
				</div>
				<div class="colum-main">
					<button type="button" class=" btn-blue">등록</button>
				</div>
			</div>
		</form>
	</main>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>