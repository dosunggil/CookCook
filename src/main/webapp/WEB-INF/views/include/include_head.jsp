<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath"/>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>CookCook</title>

<!-- 공용 -->
<link rel="stylesheet" href="${rootPath}/resources/css/reset.css" />
<link rel="stylesheet"	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<script	src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/js/all.min.js"></script>
<link  href="${rootPath}/resources/css/main.css?0004" rel="stylesheet" />
<!-- 공용 끝 -->

<!-- 조도성 -->
<script src="${rootPath}/resources/js/theme.js?ver=2022-05-30-0005"></script>
<script src="${rootPath}/resources/js/home.js?19999"></script>
<script src="${rootPath}/resources/js/cho/login.js?ver=2022-05-18-018"></script>
<script src="${rootPath}/resources/js/cho/join.js?ver=2022-05-18-018"></script>
<script src="${rootPath}/resources/js/cho/recipe/input.js?ver=2022-05-18-018"></script>
<link  href="${rootPath}/resources/css/cho/list.css" rel="stylesheet" />
<link  href="${rootPath}/resources/css/cho/detail.css" rel="stylesheet" />
<%-- <script src="${rootPath}/resources/js/log.js?ver=2022-05-13-001"></script> --%>
<!-- 조도성 끝-->

<!-- 안혁 -->
<script src="${rootPath}/resources/js/ahn/log.js?ver=2022-05-09-006" /></script>
<script src="${rootPath}/resources/js/ahn/join.js?ver=2022-05-09-007" /></script>
<%-- <script src="${rootPath}/resources/js/log.js?ver=2022-05-09-003" /></script> --%>
<link rel="stylesheet" href="${rootPath}/resources/css/ahn/log.css" />
<link rel="stylesheet" href="${rootPath}/resources/css/ahn/detail.css" />
<link rel="stylesheet" href="${rootPath}/resources/css/ahn/signup.css" />
<!-- 안혁끝 -->


<!-- 장준영 -->
<link rel="stylesheet" href="${rootPath}/resources/css/chang/list.css" />
<link rel="stylesheet" href="${rootPath}/resources/css/chang/registerContent.css" />
<script src="${rootPath}/resources/js/chang/list.js?ver=2022-05-13-004"></script>
<!-- 장준영 끝 -->
<script>const rootPath = "${rootPath}"</script>
</head>