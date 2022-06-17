<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<main>
		<div class="content_top">
			<div>손쉬운 식재료 보관법</div>
		</div>
		<div class="content_main">

			<div class="listname">
				<h3>
					오늘의 <span class="font_highlight">쿡쿡</span>
				</h3>
			</div>
			<div class="list_box cho-list-containerVer2">
				<ul id="list_today">
				<c:forEach items="${RECIPES}" var="RAND">
					<li>
						<div class="cho-list-boxVer2" data-seq="${RAND.RCP_SEQ}" data-nm="${RAND.RCP_NM}">
							<img class="img-list-home" src="${RAND.ATT_FILE_NO_MK}" />
						</div>
						<div class="text-box">${RAND.RCP_NM}</div>
					</li>
				</c:forEach>
				</ul>
				<!-- <div class="bracket-box bracket-right"><i style="color:white" class="fa-solid fa-chevron-right fa-3x"></i></div>
				<div class="bracket-box bracket-left"><i style="color:white" class="fa-solid fa-chevron-left fa-3x"></i></div>
				<div id="today"> -->

			</div>
		</div>
	</main>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>