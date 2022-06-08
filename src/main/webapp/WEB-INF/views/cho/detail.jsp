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
		<div class="cho-detail-container">
			<div class="cho-detail-top cho-detail">
				<div class="cho-big-img-box">
					<img src="${RECIPE.ATT_FILE_NO_MK}">
				</div>
				<div><h1>${RECIPE.RCP_NM}</h1></div>
			</div>
			<div class="cho-detail-middle cho-detail">
			</div>
			<div class="cho-detail-bottom cho-detail">
			</div>
		
		
		</div>
	
	
	
	</main>
		<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>