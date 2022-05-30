# 팀프로젝트 Branch 설정 
## 2022-05-11

# 2022-05-11 관리
* 모든 작업은 본인의 branch 영역에서 수행
* 조도성(home), 안혁(log), 장준영(list) 각자의 폴더와 파일 내에서만 수정 가능
* 개인 파일이 아닌 공통 파일에 수정할 부분이 있다면 카톡으로 말하기. 

### 2022-05-30
* 로그인/프로필관리 버튼 참고
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