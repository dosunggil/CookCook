<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootpath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<style>
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}
body {
    min-width: 1240px;
        display: block;
    font-size: 14px;
    line-height: 1.42857143;
    color: #333;
}

.container {
   
    position: relative;
    width: 1240px;
    max-width: none !important;
    margin: 20px auto;
}


.contents_area {
	float: left;
	border: 1px solid black;
	width: 800px;
	height: 500px;
	padding: 0 0 20px 0;
	background: white;
}
.right_area {
	float: left;
    border: 1px solid red;
    width: 335px;
    height: 500px;
    margin-left: 10px;
    padding: 0 0 30px 0;
    background: white;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<section>
		<div class=container>
			<div class=contents_area>
				<div>
					<img>
				</div>
				<div>
					<b>재료</b>
					<span>Ingredients</span>
				</div>
				<div class=ready>
					<ul>
						<li>
						<li>
						<li>
						<li>
						<li>
					</ul>
				</div>
			</div>
			<div class=right_area>
				<div>
				
				</div>
			</div>
		</div>
	</section>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>