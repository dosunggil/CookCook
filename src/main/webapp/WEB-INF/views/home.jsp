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
<!-- 		<div class="middle_nav"> -->
<!-- 			<div class="container"> -->
<!-- 					
<!-- 				<div class="search_box"> -->
<!-- 					<form> -->
<!-- 						<fieldset> -->
<!-- 							<input type="text" placeholder="레시피 검색!"> -->
<!-- 							<button type="submit"> -->
<!-- 								<i class="fa-solid fa-magnifying-glass"></i> -->
<!-- 							</button> -->
<!-- 						</fieldset> -->
<!-- 					</form> -->
<!-- 				</div> --> 
<!-- 			</div> -->
<!-- 		</div> -->
		<div class="content_top">
			<div>손쉬운 식재료 보관법</div>
		</div>
		<div class="content_main">

			<div class="listname">
				<h3>
					오늘의 <span class="font_highlight">쿡쿡</span>
				</h3>
			</div>
			<div class="list_box">
				<ul id="list_today">
					<li>
						<div>
							<img src="${rootPath}/resources/images/tokbokk.jpg" />
						</div>
						<div class="text-box">진짜 만들기 쉬운 초간단 떡볶이1</div>
					</li>
					<li>
					<div>
					<img src="${rootPath}/resources/images/toast.jpg" />
					</div>
						<div class="text-box">역대급 치즈 토스트!2</div></li>
					<%-- <li><a> <img src="${rootPath}/resources/images/steak.jpg" />
							<div>촉촉한 함박 스테이크 무조건 맛있게3</div>
					</a></li> --%>
					<li>
					<div>
					<img src="${rootPath}/resources/images/pasta.jpg" />
					</div>
						<div class="text-box">토마토4</div></li>
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