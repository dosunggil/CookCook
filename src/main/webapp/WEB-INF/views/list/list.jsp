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
<style>
main {
	width: 100%;
	height: 100%;
}

main div {
	width: 70%;
	margin: 0px auto;
	display: flex;
	flex-direction: column;
}

div section {
	height: 30%;
}
</style>
<%@ include	file="/WEB-INF/views/include/include_head.jsp" %>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<main>
		<div>
			<section>
				<article>
					<img src="${rootPath}/resources/images/steak.jpg">
				</article>
				<div>
					<article>요리 제목</article>
					<article>요리 소개</article>
				</div>
			</section>
			<section>
				<article>
					<img src="${rootPath}/resources/images/steak.jpg">
				</article>
				<div>
					<article>요리 제목</article>
					<article>요리 소개</article>
				</div>
			</section>
			<section>
				<article>
					<img src="${rootPath}/resources/images/steak.jpg">
				</article>
				<div>
					<article>요리 제목</article>
					<article>요리 소개</article>
				</div>
			</section>
		</div>
	</main>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>