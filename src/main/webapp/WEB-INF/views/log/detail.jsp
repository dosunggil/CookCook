<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootpath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<style>
* {
	box-sizing: content-box;
	margin: 0;
	padding: 0;
}

main {
	min-width: 1190px;
}

body {
	display: block;
	font-size: 14px;
	line-height: 1.42857143;
	color: #333;
}

.container {
	position: relative;
	width: 1130px;
	max-width: none !important;
	margin: 20px auto;
	display: flex;
	justify-content: space-between;
}

.contents_area {
	margin: 50px 0;
}

.divs {
	float: left;
	border: 1px solid black;
	width: 700px;
	background: white;
	position: relative;
	margin: 10px;
}

.divs {
	float: left;
	margin: 10px 0;
}

.right_area {
	float: right;
	border: 1px solid red;
	width: 300px;
	height: 500px;
	padding: 0 0 30px 0;
	background: white;
	margin: 50px 0;
}

.content_in img {
	width: 600px;
	margin: 20px auto;
}

.divs {
	padding: 50px;
	margin: 10px;
}

.best_tit {
	padding: 35px 20px 0 25px;
}

.ready {
	padding: 0 20px 18px 24px;
	vertical-align: top;
}

.ready_tit {
	padding-bottom: 8px;
	color: #333;
	font-size: 16px;
	padding-left: 20px;
	display: block;
}

.ready ul {
	padding: 0 0 25px 0;
	width: 50%;
	display: inline-block;
	vertical-align: top;
	float: left;
}

.ready li {
	border-bottom: 1px solid #ececec;
	padding: 10px 6px;
	list-style: none;
	margin: 0 35px;
	font-size: 16px;
}

.ready li ingre_unit {
	float: right;
	color: #999;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<main>
		<section class=container>
			<div class=contents_area>
				<div class=divs>
					<article class=content_in>
						<img src="${rootPath}/resources/images/tokbokk.jpg" />
					</article>
					<article>
						<h1>마늘쫑고추장무침 만드는 법 : 10분만에 완성되는 간단한 밑반찬 ♩</h1>
						<p>요즘 식비 좀 줄여보겠다고 늘 있는 반찬에만 간단히 먹었더니 새로운 반찬이 먹고 싶더라고요. 그래서
							오래간만에 매콤달콤 밥도둑 마늘쫑 고추장 무침을 만들어 봤어요! 끓는 물에 마늘쫑 데쳐 양념 넣고 무치기만 하면
							간단하게 완성되는 밑반찬이다 보니 주부들에게 늘 사랑받는 반찬, 마늘쫑 고추장 무침 ♩ 그럼 한 번 만들어볼까요?
							:)></p>
					</article>
				</div>
				<div class=divs>
					<div class=best_tit>
						<b class=ready_tit>재료</b> <span>Ingredients</span>
					</div>
					<div class=ready>
						<b class=rea_tit>[재료]</b>
						<ul>
							<li>"마늘쫑"<img
								src="https://recipe1.ezmember.co.kr/img/mobile/icon_info.png"
								style="width: 20px; height: 20px; margin-left: 2px; vertical-align: middle;">
								<span class="ingre_unit">1묶음(약 160g)</span></li>

						</ul>
						<b class=rea_tit>[양념]</b>
						<ul>
							<li>"고춧가루"<img
								src="https://recipe1.ezmember.co.kr/img/mobile/icon_info.png"
								style="width: 20px; height: 20px; margin-left: 2px; vertical-align: middle;">
								<span class="ingre_unit">1묶음(약 160g)</span></li>
							<li>"고춧가루"<img
								src="https://recipe1.ezmember.co.kr/img/mobile/icon_info.png"
								style="width: 20px; height: 20px; margin-left: 2px; vertical-align: middle;">
								<span class="ingre_unit">1묶음(약 160g)</span></li>
							<li>"고춧가루"<img
								src="https://recipe1.ezmember.co.kr/img/mobile/icon_info.png"
								style="width: 20px; height: 20px; margin-left: 2px; vertical-align: middle;">
								<span class="ingre_unit">1묶음(약 160g)</span></li>
							<li>"고춧가루"<img
								src="https://recipe1.ezmember.co.kr/img/mobile/icon_info.png"
								style="width: 20px; height: 20px; margin-left: 2px; vertical-align: middle;">
								<span class="ingre_unit">1묶음(약 160g)</span></li>
							<li>"고춧가루"<img
								src="https://recipe1.ezmember.co.kr/img/mobile/icon_info.png"
								style="width: 20px; height: 20px; margin-left: 2px; vertical-align: middle;">
								<span class="ingre_unit">1묶음(약 160g)</span></li>
						</ul>
					</div>
				</div>
					<div class=right_area>
						<div></div>
					</div>
			</div>
		</section>
	</main>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>