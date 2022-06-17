<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<main class="cho-main-mypage">
		<nav class="cho-nav-mypage">
			<ul>
				<li><a href="${rootPath}/cho/user/${USER.username}/update">내 프로필</a></li>
				<li><a href="${rootPath}/cho/user/${USER.username}/updatePass">보안 설정</a></li>
				<li><a href="${rootPath}/cho/user/${USER.username}/updateRecipe">내 레시피</a></li>
			</ul>
		</nav>
		<div class="cho-container-mypage">
			<div class="cho-container-mypage2">
				<div class="cho-mypage-top">
					<h2>보안 설정</h2>
					<p>비밀번호를 수정할 수 있습니다.</p>
				</div>

				<form method="POST"  class="join">
							<input type="text" value="${USER.username}" name="username" hidden="hidden">
					<div class="cho-mypage-middle cho-mypage-middle-pass">
						<div class="cho-edit-status">
							<div>현재 비밀번호</div>
							<input type="password" name="pre_password">
							<div>새 비밀번호</div>
							<input  class="password1" type="password"  name="password">
							<div>새 비밀번호 확인</div>
							<input  class="re_password1" type="password"  name="re_password">
						</div>
						
					</div>
					<div class="cho-mypage-bottom">
						<button type="button" id="btn-modify">저장</button>
						<div class="btn-edit-photo">취소</div>
					</div>
				</form>
			</div>



		</div>
	</main>

	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>