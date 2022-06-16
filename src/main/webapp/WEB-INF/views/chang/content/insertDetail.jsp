<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="rootpath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<%@ include file="/WEB-INF/views/include/include_head.jsp"%>
<body>
	<%@ include file="/WEB-INF/views/include/include_header.jsp"%>
	<main>
		<form method="post" class="ch-content-input">
			<section class=container>
				<div class=contents_area>
					<div class=cont>
						<div class=divs>
							<article class=content_in>
							<!-- http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00016_1.png -->
							<!-- http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00009_1.png -->
							<!-- http://www.foodsafetykorea.go.kr/uploadimg/cook/10_00010_1.png -->
								<input type="text" class="ATT_FILE_NO_MK" name="ATT_FILE_NO_MK" >
								<img />
							</article>
							<article class=content_in>
								<h1>
									<input type="text" class="RCP_NM" name="RCP_NM" value="${postVO.RCP_NM}">
								</h1>
								<div class="sub-content">
									<textarea rows="4" cols="45" class="rcp_content" name="rcp_content" value="${postVO.rcp_content} "></textarea>
								</div>
							</article>
						</div>
						<div class=divs>
							<div class="divs_first">
								<div class=best_tit>
									<b class=ready_tit>재료</b> <span>Ingredients</span>
								</div>
								<div class=ready>
									<div>
										<table>
											<tr>
												<th>100g당 열량</th>
												<td><input type="text" name="INFO_ENG" class="info_eng" value="${postVO.INFO_ENG}">Kcal</td>
											</tr>
										</table>
										<div class="ch-ingredient">양념&재료</div>
										<div class="ch-rcp-parts-dtls">
											<textarea rows="4" cols="45" class="rcp_parts-dtls" name="RCP_PARTS_DTLS" value="${postVO.RCP_PARTS_DTLS}"></textarea>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class=divs>
							<div id=proc>
								<div>RECIPE 순서</div>
							</div>
							<div>
								<button type="button" class="add-input">추가하기</button><button type="button" class="delete-input">삭제하기</button>
							</div>
							<div class="add-input-image-title">
								<div>
									<input type="text" name="manual_img" >
								</div>
								<div>
									<img />
								</div>
								<div>
									<input type="text" class="manual" name="manual" value="${manualVO.manual}" >
								</div>
							</div>
							
							
						</div>
					</div>
				</div>
			</section>
			<button class="ch-button-update">수정하기</button>
		</form>
	</main>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>