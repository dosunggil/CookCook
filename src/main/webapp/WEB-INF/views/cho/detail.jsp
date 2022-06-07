<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE-edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Insert title here</title>
</head>
<body>
<h1> 디테일 페이지</h1>
	<c:forEach items="${RECIPE}" var="RECIPE">
	<p>${RECIPE.RCP_NM} 페이지입니다.
	<p>${RECIPE.RCP_SEQ} 페이지입니다.
	</c:forEach>
	
	
</body>
</html>