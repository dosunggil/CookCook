<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<header>
	<div class="top_nav">
		<div class="logo_box btn-go-home">
			<img class="logo" src="${rootPath}/resources/images/logo.png">
		</div>
		<div class="cookcook btn-open ">상세검색</div>
		<div class="hidden-box">
			<div class="drop-menu-container">
				<div class="drop-menu-search">
					재료 검색 <input type="text">
				</div>
				<div class="drop-menu-result">재료 목록</div>
				<div class="drop-menu-list">선택 목록</div>
			</div>
			<!-- <div class="drop-menu-close btn-close">접기</div> -->
		</div>
		<div class="search_box">
			<form method="GET" action="${rootPath}/cho/post/search">
				<fieldset>
					<input class="btn-search" type="text" name="title" id="title"
						placeholder="레시피 검색!">
					<button type="submit" class="btn-search">
						<i class="fa-solid fa-magnifying-glass"></i>
					</button>
				</fieldset>
			</form>
		</div>
		<div class="profile">
			<c:if test="${empty USER}">
				<div class="btn-login">
					<a href="${rootPath}/ahn/log/log"> <img class="img-login"
						src="${rootPath}/resources/images/in.png" />
					</a>
				</div>
			</c:if>
			<c:if test="${not empty USER}">
				<div class="btn-profile btn-open">
					<img class="img-profile"src="${rootPath}/resources/images/mokoko.png" />
				</div>
				<div class="hidden-box">
					<div class="profile-menu-container">
						<div class="profile-menu profile-mypage">
							<a href="${rootPath}/cho/user/${USER.username}/update">마이페이지</a></div>
						<div class="profile-menu profile-recipe">레시피관리</div>
						<div class="profile-menu profile-logout">
							<a href="${rootPath}/cho/user/logout"><img class="img-logout"src="${rootPath}/resources/images/logout.png" />
							로그아웃</a></div>
					</div>
				</div>
			</c:if>
		</div>
		<!-- <div class="btn-theme">
			<i class="fa-solid fa-circle-half-stroke"></i>
		</div> -->
	</div>
	<section class="modal" id="modal-box"></section>
</header>
