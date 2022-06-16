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
		<section class=container>
			<div class=contents_area>
				<div class=cont>
					<div class=divs>
						<article class=content_in>
							<img src="${postVO.ATT_FILE_NO_MK}" />
						</article>
						<article class=content_in>
							<h1>${postVO.RCP_NM }</h1>
							<div class="sub-content">${postVO.rcp_content}</div>
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
											<td>${postVO.INFO_ENG}Kcal</td>
										</tr>
									</table>
									<div class="ch-ingredient">양념&재료</div>
									<div class="ch-rcp-parts-dtls">${postVO.RCP_PARTS_DTLS}</div>
								</div>
							</div>
						</div>
					</div>
					<div class=divs>
						<div id=proc>
							<div>RECIPE 순서</div>
						<div>
							<c:forEach items="${MANUAL}" var="manual">
								<img src="${manual.manual_img}" />
								<p>${manual.manual}</p>
							</c:forEach>
						</div>
						</div>
					</div>

				</div>
				<div class=right_area>
					<div>[재료]</div>
					<ul>
						<li><input type="checkbox">닭</li>
						<li><input type="checkbox">대파</li>
						<li><input type="checkbox">꽈리고추</li>
					</ul>
					<div>[양념]</div>
					<ul>
						<li><input type="checkbox">고춧가루</li>
						<li><input type="checkbox">후추가루</li>
						<li><input type="checkbox">통깨</li>
						<li><input type="checkbox">다진마늘</li>
						<li><input type="checkbox">고추장</li>
					</ul>

				</div>
			</div>
		</section>
		<button class="ch-button-list">리스트 가기</button>
	</main>
	<%@ include file="/WEB-INF/views/include/include_footer.jsp"%>
</body>
</html>