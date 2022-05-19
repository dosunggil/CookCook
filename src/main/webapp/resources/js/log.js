document.addEventListener("DOMContentLoaded", () => {
  const login = document.querySelector("button.login");
  const home = document.querySelector("img.logo");
  const signup = document.querySelector(".signup");

  if (signup) {
    signup.addEventListener("click", () => {
      let url = `${rootPath}`;
      url += "/signup";
      document.location.href = url;
    });
  }

  /*
    로그인 눌렀을 때 빨간글씨로 입력오류 노출
  */
  if (login) {
    login.addEventListener("click", () => {
      const show = document.querySelector("p.show");
      show.style.display = "block";
      login.style.transform = "translate(0, 30%)";
      const id = document.querySelector("input.id");
      id.focus();
    });
  }
  /*
    이미지 버튼 눌렀을 때 홈화면으로 이동.
    */
  if (home) {
    home.addEventListener("click", () => {
      let url = `${rootPath}`;
      url += "/";
      document.location.href = url;
    });
  }
});
