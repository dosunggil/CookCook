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
<h1>여기는 마이페이지</h1>
<ul>
		<c:forEach items="${MY_RECIPES}" var="RECIPE">
			<li>${RECIPE.b_seq}, &nbsp; &nbsp; ${RECIPE.recipe.RCP_PARTS_DTLS},&nbsp; &nbsp;
		</c:forEach>
	</ul>
<a href="${rootPath}/cho/recipe/insert">레시피 등록하기</a>
</body>
</html>