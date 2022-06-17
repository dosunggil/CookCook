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
main.mainA {
	height: 100vh;
}
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<main class="mainA">
		<div class="formA">

			<form class="join" autocomplete="off" method="POST"
				action="${rootPath}/cho/user/searchPASS">
				<fieldset>
					<legend>Sign Up</legend>
					<div class="form-mainA">
						<div class="colum-mainA username">
							<div>아이디</div>
							<div>
								<input class="input-username" name="username" type="text">
							</div>
						</div>
						<div class=username1></div>
					</div>
					<div class=nickname1></div>
					<div class="colum-mainA email">
						<div>이메일</div>
						<div>
							<input class="input-email2" name="email" type="text">
						</div>
					</div>
					<div class="colum-mainA-btn">
						<div>
							<button type="button" class="btn-sign btn-searchPASS" id="btn-search2">조회하기</button>
						</div>
					</div>
					<c:choose>
						<c:when test="${USERPASS2 == 'NULL'}">
							<div style="color: red ; font-size: 16px;">일치하는 정보가 없습니다. 다시 입력해주세요.</div>
						</c:when>
					</c:choose>
				</fieldset>
			</form>
		</div>
	</main>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>