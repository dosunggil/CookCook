<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>
<link  href="${rootPath}/resources/css/cho/mypage.css" rel="stylesheet" />
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<main class="cho-main-mypage">
		<nav class="cho-nav-mypage">
			<ul>
				<li>내 프로필</li>
				<li>레시피 관리</li>
			</ul>
		</nav>
		<div class="cho-container-mypage">
			<div class="cho-mypage-top">
				<h2>프로필 수정</h2>
				<p>프로필 사진과 닉네임을 수정할 수 있습니다.</p>	
			</div>
			<div class="cho-mypage-middle">
			
			
			
			
			</div>
			


		</div>


	</main>

</body>
</html>