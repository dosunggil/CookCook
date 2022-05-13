document.addEventListener("DOMContentLoaded", () => {
  const login = document.querySelector("div.btn-login");
  const search = document.querySelector("button.btn-search");
  const go_home = document.querySelector("div.btn-go-home");
  /*
    로그인 버튼 눌렀을 때 로그인 화면으로 이동.
    */
  if (login) {
    login.addEventListener("click", () => {
      let url = `${rootPath}`;
      url += "/log";
      document.location.href = url;
    });
  }

  /*
    검색 버튼 눌렀을 때 레시피 목록으로 이동.
  */
  if (search) {
    search.addEventListener("click", () => {
      let url = `${rootPath}`;
      url += "/list";
      document.location.href = url;
    });
  }
  /*
    모든 btn-go-home 클래스에 대해서 눌럿을때 홈으로 이동
  */
  if (go_home) {
    go_home.addEventListener("click", () => {
      let url = `${rootPath}`;
      url += "/";
      document.location.href = url;
    });
  }
});
