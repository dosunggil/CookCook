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
			<div class="searchPASS">
				<form class="join" autocomplete="off" method="POST"
				action="${rootPath}/cho/user/updatePass">
					<input name="username"  hidden="hidden" value="${USER.username}"></input>
					<div class="colum-mainA password">
						<div>변경 할 비밀번호</div>
						<div>
							<input class="password1" name="password" type="password">
						</div>
					</div>
					<div class="colum-mainA re_password">
						<div>비밀번호 확인</div>
						<div>
							<input class="re_password1" name="re_password" type="password">
						</div>
					</div>
					<div class="colum-mainA-btn">
						<div>
							<button type="button" class="btn-sign" id="btn-modify">변경하기</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</main>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>