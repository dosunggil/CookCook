<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<header>
	<div class="top_nav">
		<div class="logo_box btn-go-home">
			<img class="logo" src="${rootPath}/resources/images/logo.png">
		</div>
		<div class="cookcook">임시
			<div class="drop-menu">
				<div>
					<div>재료 검색</div>
					<div>재료 목록</div>
					<div>선택 목록</div>
				</div>
			</div>
		</div>
		<div class="search_box">
			<form>
				<fieldset>
					<input type="text" name="search" placeholder="레시피 검색!">
					<button type="button" class="btn-search">
						<i class="fa-solid fa-magnifying-glass"></i>
					</button>
				</fieldset>
			</form>
		</div>
		<div class="profile btn-login">
			<a> <img src="${rootPath}/resources/images/in.png" />
			</a>
		</div>
	</div>
</header>
