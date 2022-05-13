<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>listV1</title>
<link rel="stylesheet" href="${rootPath}/resources/css/reset.css" />
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>
<style>
main {
	width: 1130px;
	height: 100%;
	margin: 0 auto;
	
}
</style>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<main>
	
	
	<img src="${rootPath}/resources/images/steak.jpg">
	
	
	
	</main>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>