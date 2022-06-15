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
<style>
a {
	text-decoration: inherit;
}

colum-mainA-btn {
	margin-left: 0 auto;
}

.form-mainA {
	margin: 10px;
}
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<main class="mainA">
		<div class="formA">
			<form class="join" autocomplete="off" method="POST"
			>
				<fieldset>
					<legend>Search</legend>
					<div class="form-mainA">
						<div class="colum-mainA email">
							<div>이메일</div>
							<div>
								<input class="input-email" name="email" type="text">
							</div>
						</div>
						<div class="colum-mainA-btn">
							<div>
								<button type="button" class="btn-sign btn-searchID" id="btn-search">조회하기</button>
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