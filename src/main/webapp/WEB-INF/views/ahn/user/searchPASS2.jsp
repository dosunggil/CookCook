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
.searchPASS {
	margin-left: 0 auto;
}
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<main class="mainA">
		<div class="formA">
			<div class="searchPASS">
				<form method="POST">
					<c:choose>
						<c:when test="${USERPASS2 == 'NULL'}">
							<div>일치하는 정보가 없습니다. 다시 입력해주세요.</div>
						</c:when>
						<c:when test="${USERPASS2 == 'OK'}">
							<div>
								<input name="password"> 패스워드 
								<input> 패스워드확인
							</div>
						</c:when>
					</c:choose>
				</form>
			</div>
		</div>
	</main>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>