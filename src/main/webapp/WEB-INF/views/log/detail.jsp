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
	justify-content: space-between;
}

.contents_area {
	margin: 50px 0;
	display: flex;
	position: relative;
	width: 1130px;
}

.divs {
	float: left;
	border: 1px solid black;
	width: 600px;
	background: white;
	position: relative;
	margin: 10px;
	padding: 20px 100px;
}

.cont {
	width: 820px;
}

.right_area {
	border: 1px solid black;
	width: 330px;
	height: 300px;
	padding: 0 0 30px 0;
	background: white;
	margin: 10px 0;
	padding: 0 0 30px 0;
	font-size: 20px;
	position: sticky;
	margin-left: auto;
	top: 20%;
}

.right_area p {
	padding: 20px;
}

.content_in img {
	width: 600px;
	margin: 20px auto;
}

.content_in {
	font-size: 30px;
}

#proc {
	font-size: 50px;
	text-align: center;
	text-decoration: underline;
	font-weight: bold;
}

.divs p {
	padding: 20px;
	font-size: 20px;
}



.best_tit {
	padding: 30px 10px 20px 10px;
}

.ready {
	padding: 0 20px 18px 24px;
	vertical-align: top;
	display: flex;
}

.ready_tit {
	padding-bottom: 8px;
	color: #333;
	font-size: 16px;
	padding-left: 20px;
	display: flex;
	font-size: 20px;
	font-weight: bold;
}

.rea_tit {
	width: 70px;
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
				<div class=cont>
					<div class=divs>
						<article class=content_in>
							<img src="${rootPath}/resources/images/tokbokk.jpg" />
						</article>
						<article class=content_in>
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
					<div class=divs>
						<p id=proc><span>RECIPE 순서</span></p>
						<div>
							<p>1.대파는 송송 썬다.</p>
							<p>2.팬에 기름을 두르고 닭을 굽듯이 볶는다.</p>
							<p>3.송송 썬 대파를 넣고 함께 볶는다.</p>
							<p>4.닭이 어느 정도 익으면 설탕을 넣는다.</p>
							<p>5.가운데에 자리를 만들어 간장을 넣고 볶는다.</p>
							<p>6.물, 다진마늘을 넣고 국물이 자작할 때까지 졸인다.</p>
							<p>7.꽈리고추를 넣고 빠르게 볶은 후 불을 끈다.</p>
							<p>8.후추, 통깨를 뿌려 완성한다.</p>
						</div>
					</div>

				</div>
				<div class=right_area>
					<div>[재료]</div>
					<ul>
					<li>닭</li>
					<li>대파</li>
					<li>꽈리고추</li>
					</ul>
					<div>[양념]]</div>
					<ul>
					<li>고춧가루</li>
					<li>후추</li>
					<li>통깨</li>
					</ul>
				</div>
			</div>
		</section>
	</main>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>