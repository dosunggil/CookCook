# DB API 주소 [링크](http://www.foodsafetykorea.go.kr/api/openApiInfo.do?menu_grp=MENU_GRP31&menu_no=661&show_cnt=10&start_idx=1&svc_no=COOKRCP01)

# 2022-05-11 관리

- 모든 작업은 본인의 branch 영역에서 수행
- 조도성(home), 안혁(log), 장준영(list) 각자의 폴더와 파일 내에서만 수정 가능
- 개인 파일이 아닌 공통 파일에 수정할 부분이 있다면 카톡으로 말하기.

# 2022-05-30

- 로그인/프로필관리 버튼 참고

```
<c:choose>
	<c:when test="${empty USER}">
		<li>로그인</li>
		<li>회원가입</li>
	</c:when>
	<c:otherwise>
		<li>로그아웃</li>
	</c:otherwise>
</c:choose>
```

# 2022-05-31 OpenAPI 적용하기 [Naver 검색 실습](https://github.com/dosunggil/Spring/tree/master/SpMVC_004_Naver)

- JSON 형식으로 API 데이터 받기.
- API 출력인자의 변수들을 담을 VO 클래스를 만든다. (어떤 방식으로 응답하는지 확인) 참고: [NaverBookVO](https://github.com/dosunggil/Spring/blob/master/SpMVC_004_Naver/src/main/java/com/cho/naver/model/NaverBookVO.java)
- OpenAPI 사이트에 요청할 QueryString 을 생성하는 method 작성. 참고 : [NaverBookServiceEX](https://github.com/dosunggil/Spring/blob/master/SpMVC_004_Naver/src/main/java/com/cho/naver/service/exec/NaverBookServiceEx.java)

### OpenAPI >> 게시글 리스트 참고

```
<table class="ch-table">
	<colgroup>
		<col width="300px">
		<col width="100px">
		<col width="100px">
	</colgroup>
	<thead>
		<tr>
			<th>도서명</th>
			<th>출판사</th>
			<th>글쓴이</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${BOOKS}" var="BOOK">
			<tr>
				<td>${BOOK.title}</td>
				<td>${BOOK.publisher}</td>
				<td>${BOOK.author}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
```

### COMMIT 사항

- API 작업 끝내고, 디자인은 안한 commit
- b1e8078b171720e363e92169a29582577e54e624

### recipe 테이블과 테이블 변수 이름
* 변경사항1 : 이미지 파일 (소),(대) 를 (대) 만 써도 되므로 (소)는 삭제함
* 변경사항2 : SEQ 값은 관리하기 쉽게 number 로 교체함 (사실 문자열이어도 상관없음)
* 변경사항3 : rcp_content 는 API 에는 없는 내용으로 새로 추가한 칼럼

```

create table tbl_recipe(
RCP_SEQ number PRIMARY KEY ,
RCP_NM nVARCHAR2(125) not null ,
rcp_content nVARCHAR2(1000) ,
ATT_FILE_NO_MK VARCHAR2(500) ,
INFO_ENG NUMBER(5) , //열량
RCP_PARTS_DTLS nVARCHAR2(1000) , // 재료정보
HASH_TAG nVARCHAR2(200) , // 해쉬태그 (해쉬태그는 사용할지 말지 고민중)
POST_STAR number(5)

) 
```

