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
<link rel="stylesheet" href="${rootPath}/resources/css/list.css" />
<script src="${rootPath}/resources/js/list.js?ver=2022-05-13-004"></script>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<div class ="main">
		<c:forEach var="i" begin="1" end="5">

			<section class="section-colum">
				<article class="img-article">
					<img src="${rootPath}/resources/images/steak.jpg">
				</article>
				<div class="div-article">
					<article class="title-article">스테이크</article>
					<article class="content-article">센 불에서 튀기듯이 구워 겉은 바삭바삭
						육즙이 속에 가두어져 속은 촉촉. 이건 당연히 맛이 없을 수가 없겠죠~거기에 홀그레인 머스타드는 고기 특유의 느끼함을
						잡아주고. 요새는 마트에서 판매하는 소스도 맛있게 잘 나와서 넘 맛있는 한 끼네요.</article>
					<article class="stars-article">4</article>
				</div>
			</section>

		</c:forEach>
	</div>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>