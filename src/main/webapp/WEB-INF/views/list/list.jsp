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
	width: 1130px;
	height: 100%;
	margin: 0 auto;
}

main div {
	height: 100%;
	display: flex;
	flex-direction: column;
	border:1px solid blue;
}

div section {
	height: 30%;
	width: 100%;
	margin: 10px 0;
	display: flex;
	margin: 10px 0;
	border:1px solid yellow;
}

div section article {
	width: 35%;
	height: 100%;
}

div section div article {
	margin: 20px;
}

div section div article:nth-of-type(1) {
	font-size: 20px;
	font-weight: 900;
	
}

div section div article:nth-of-type(2) {
	flex: 1;
	border:1px solid red;
}

div section div article:nth-of-type(3) {
	
}


article img {
	width: 300px;
	height: 300px;
	object-fit: cover;
}
</style>
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>
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
					<article>스테이크</article>
					<article>
						<p>맛있어 맛있어 맛있어 맛있어 맛있어 맛있어 맛있어 맛있어 맛있어 맛있어 맛있어 맛있어</p>
					</article>
					<article>별점</article>
				</div>
			</section>
			<section>
				<article>
					<img src="${rootPath}/resources/images/steak.jpg">
				</article>
				<div>
					<article>요리 제목</article>
					<article>요리 소개</article>
					<article>별점</article>
				</div>
			</section>
			<section>
				<article>
					<img src="${rootPath}/resources/images/steak.jpg">
				</article>
				<div>
					<article>요리 제목</article>
					<article>요리 소개</article>
					<article>별점</article>
				</div>
			</section>
		</div>
	</main>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>