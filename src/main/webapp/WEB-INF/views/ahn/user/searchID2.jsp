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
.searchID {
	margin-left: 0 auto;
}
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<main class="mainA">
		<div class="formA">
			<div class="searchID">
			<c:choose>
				<c:when test="${USERNAME == 'NULL'}">
					<div> 해당 이메일로 등록된 유저 정보가 없습니다.</div>
				</c:when>
				<c:when test="${USERNAME == 'OK'}">
					<div>
						귀하의 ID는 <span style="color:red">${USER1.username}</span> 입니다.
					</div>
				</c:when>
			</c:choose>
			</div>
		</div>
	</main>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>