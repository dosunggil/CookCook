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
				<h1>${RECIPE.RCP_NM}</h1>
				<div>
				칼로리   : ${RECIPE.INFO_ENG}
				탄수화물 : ${DETAIL.INFO_CAR}
				단백질   : ${DETAIL.INFO_PRO}
				지방     : ${DETAIL.INFO_FAT}
				나트륨   : ${DETAIL.INFO_NA}
				</div>
			</div>
			<div class="cho-detail-middle cho-detail">
				
					  
					  
						
				  <%--    <p>책명 : ${DETAIL.manual.get(0)}</p>
				     <p>책명 : ${DETAIL.MANUAL01}</p> --%>
			
			</div>
			<div class="cho-detail-bottom cho-detail">
			</div>
		
		
		</div>
	
	
	
	</main>
		<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>