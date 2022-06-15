<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>
<link  href="${rootPath}/resources/css/cho/mypage.css" rel="stylesheet" />
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<nav class="cho-nav-mypage">
		<ul>
				<li>내 프로필</li>
				<li>레시피 관리</li>
		</ul>
	</nav>
	
	<h1>여기는 마이페이지</h1>

</body>
</html>