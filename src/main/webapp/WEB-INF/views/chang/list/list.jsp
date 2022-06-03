<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>

<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<main>
		<div class="ch-main">
			<c:forEach items="CONTENT" var="postVO">
				<section class="section-colum">
					<article class="img-article">
						<img src="${rootPath}/resources/images/pizza.jpg">
					</article>
					<div class="div-article">
						<article class="title-writer"><%-- ${postVO.username}--%></article>
						<article class="title-article">${postVO.contentsTitle}</article>
						<article class="content-article">${postVO.contentsArticle}</article>
						<article class="stars-article"><%--${postVO.stars}--%></article>
					</div>
				</section>
			</c:forEach>
		</div>
	</main>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>