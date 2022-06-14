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
			<c:forEach items="${CONTENT}" var="postVO">
				<section class="section-colum" data-postseq="${postVO.post_seq}" >
					<article class="img-article">
						<img src=${postVO.POST_IMG_SMALL}>
					</article>
					<div class="div-article">
						<article class="title-writer">username</article>
						<article class="title-article">${postVO.POST_TITLE}</article>
						<article class="content-article">${postVO.POST_CONTENT}</article>
						<article class="stars-article">stars</article>
					</div>
				</section>
			</c:forEach>
		</div>
	</main>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>