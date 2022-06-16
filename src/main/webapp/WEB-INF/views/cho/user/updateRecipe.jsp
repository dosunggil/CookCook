<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<script>


</script>
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>
<link href="${rootPath}/resources/css/cho/mypage.css" rel="stylesheet" />
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<main class="cho-main-mypage">
		<nav class="cho-nav-mypage">
			<ul>
				<li><a href="${rootPath}/cho/user/${USER.username}/update">내 프로필</a></li>
				<li>암호 관리</li>
				<li><a href="${rootPath}/cho/user/${USER.username}/updateRecipe">내 레시피</a></li>
			</ul>
		</nav>
	
		<div class="cho-container-mypage">
			<div class="cho-container-mypage2">
				<div class="cho-mypage-top">
					<h2>레시피 관리</h2>
					<p>등록한 레시피를 수정하거나 삭제할 수 있습니다.</p>
					<a class="cho-btn-regrecipe" href="${rootPath}/cho/recipe/insert">레시피 등록하기</a>
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
								<button onclick="AAA()"  class="btn-edit-photo cho-btn-delete">삭제</button>
							</div>
						</div>
					</c:forEach>
				</div>

			</div>
		</div>
	
		

	</main>
</body>
</html>