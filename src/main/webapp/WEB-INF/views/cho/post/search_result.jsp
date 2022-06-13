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
		<div class="cho-list-container">
			<c:if test="${empty RECIPES}">
				검색결과가 없습니다.
			</c:if>
			<c:forEach items="${RECIPES}" var="RECIPE">
				<div class="cho-list-box" data-nm="${RECIPE.RCP_NM}"
					data-seq="${RECIPE.RCP_SEQ}">
					<div class="cho-list-main">
						<div id="cho-rcp_nm">${RECIPE.RCP_NM}</div>
						<div id="cho-info_eng">${RECIPE.INFO_ENG}kcal</div>
						<div id="cho-post_star">${RECIPE.POST_STAR}</div>
					</div>
					<div class="cho-list-img">
						<img src="${RECIPE.ATT_FILE_NO_MAIN}">
					</div>
				</div>
			</c:forEach>
		</div>
	</main>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>