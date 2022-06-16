<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>
<link href="${rootPath}/resources/css/cho/mypage.css" rel="stylesheet" />
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<main class="cho-main-mypage">
		<nav class="cho-nav-mypage">
			<ul>
				<li>내 프로필</li>
				<li>암호 관리</li>
				<li>내 레시피</li>
			</ul>
		</nav>
		<div class="cho-container-mypage">
			<div class="cho-container-mypage2">
				<div class="cho-mypage-top">
					<h2>레시피 관리</h2>
					<p>등록한 레시피를 수정하거나 삭제할 수 있습니다.</p>
					<a href="${rootPath}/cho/recipe/insert">레시피 등록하기</a>
				</div>
				<div class="cho-myrecipe-middle">
					<c:forEach items="${MY_RECIPES}" var="RECIPE">
						<div class="cho-myrecipe-list" data-seq="${RECIPE.recipe.RCP_SEQ}">
							<div class="cho-myrecipe-img">
								<img src="${RECIPE.recipe.ATT_FILE_NO_MK }">
							</div>
							<div class="cho-myrecipe-content">
								<p>${RECIPE.recipe.RCP_NM}</p>
								<p>${RECIPE.recipe.POST_STAR}</p>
								<div onclick="return confirm('삭제?');"  class="btn-edit-photo cho-btn-delete">삭제</div>
							</div>
						</div>
					</c:forEach>
				</div>

			</div>
		</div>
	
		

	</main>
</body>
</html>