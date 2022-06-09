document.addEventListener("DOMContentLoaded", () => {
  console.log("입장완료");
  const login_form = document.querySelector("form.login");
  const username = document.querySelector("#username");
  const password = document.querySelector("#password");
  const btn_login = document.querySelector("#btn-login");

  btn_login.addEventListener("click", () => {
    console.log("버튼누름");

    if (username.value === "") {
      alert("USER NAME  을 먼저 입력하세요");
      username.focus();
      return false;
    }
    if (password.value === "") {
      alert("비밀번호를 먼저 입력하세요");
      password.focus();
      return false;
    }
    login_form.submit();
  });
});
