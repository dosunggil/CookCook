<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>retisterContent</title>
<link rel="stylesheet" href="${rootPath}/resources/css/reset.css" />
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>
</head>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<div class="main">
		<form>
			<fieldset class="form">
				<legend>CookCook Contents</legend>
				<div class="form-main">
					<div class="colum-main">
						<div>요리 제목 :</div>
						<div>
							<input type="text" placeholder="요리 제목">
						</div>
					</div>
					<div class="colum-main second">
						<div>요리 내용 :</div>
						<div>
							<textarea rows="7" cols="70"></textarea>
						</div>
					</div>
					<div class="colum-main third">
						<div>칼로리 :</div>
						<div>
							<input type="text" placeholder="칼로리를 대략 적으로 입력해 주세요">
						</div>
					</div>
					<div class="colum-main fourth">
						<div>요리 시간 :</div>
						<div>
							<input type="text" placeholder="요리시간을 대략 적으로 입력해 주세요">
						</div>
					</div>
					<div class="colum-main">
						<div>사진 선택 :</div>
						<div>
							<input type="file">
						</div>
					</div>
					<div class="colum-main">
						<button type="button" class="btn-blue">등록</button>
					</div>
				</div>
			</fieldset>
		</form>
	</div>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>