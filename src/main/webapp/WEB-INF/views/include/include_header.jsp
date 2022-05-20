<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<header>
	<div class="top_nav">
		<div class="logo_box btn-go-home">
			<img class="logo" src="${rootPath}/resources/images/logo.png">
		</div>
		<div class="cookcook btn-open">상세검색</div>
		<div class="drop-menu">
				<div class="drop-menu-container">
					<div class="drop-menu-search">재료 검색
						<input type="text">
					</div>
					<div class="drop-menu-result">재료 목록</div>
					<div class="drop-menu-list">선택 목록</div>
				</div>
				<!-- <div class="drop-menu-close btn-close">접기</div> -->
			</div>
		<div class="search_box">
			<form>
				<fieldset>
					<input class="btn-search" type="text" name="search" placeholder="레시피 검색!">
					<button type="button" class="btn-search">
						<i class="fa-solid fa-magnifying-glass"></i>
					</button>
				</fieldset>
			</form>
		</div>
		<div class="profile btn-login">
			<a> <img class="img-login" src="${rootPath}/resources/images/in.png" />
			</a>
		</div>
	<div class="btn-theme">
		<i class="fa-solid fa-circle-half-stroke"></i>
	</div>
	</div>
</header>
