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
				<li>레시피 관리</li>
			</ul>
		</nav>
		<div class="cho-container-mypage">
			<div class="cho-container-mypage2">
				<div class="cho-mypage-top">
					<h2>프로필 수정</h2>
					<p>프로필 사진과 닉네임을 수정할 수 있습니다.</p>
				</div>

				<form method="POST">
					<div class="cho-mypage-middle">
						<div class="cho-edit-status">
							<div>이름</div>
							<input type="text" value="${USER.nickname}" name="name">
							<div>상태메세지</div>
							<textarea placeholder="자기소개 글을 입력하세요." rows="7" name="bio">${USER.bio}</textarea>
						</div>
						<div class="cho-edit-photo">
							<img src="${USER.photo}">
							<div class="cho-edit-btns">
								<input accept=".gif, .jpg, .png" type="file" name="photo"
									id="cho-photo" style="display: none;"> <label
									class="btn-edit-photo" for="cho-photo">수정</label>
								<div class="btn-edit-photo">삭제</div>
							</div>
						</div>
					</div>
					<div class="cho-mypage-bottom">
						<button type="button">저장</button>
						<div class="btn-edit-photo">취소</div>
					</div>
				</form>
			</div>



		</div>
	</main>

	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>