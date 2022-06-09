document.addEventListener("DOMContentLoaded", () => {
  const username = document.querySelector("#username");
  const password = document.querySelector("#password");
  const re_password = document.querySelector("#re_password");
  const name = document.querySelector("#name");
  const nickname = document.querySelector("#nickname");
  const email = document.querySelector("#email");
  const btn_join = document.querySelector("#btn-join");

  btn_join?.addEventListener("click", () => {
    if (username.value === "") {
      alert("USER NAME 은 반드시 입력하세요.");
      username.focus();
      return false;
    }
    if (username.value.length > 20) {
      alert("USER NAME 은 20자 이내로 입력하세요.");
      username.focus();
      return false;
    }
    const passRule = /^[A-Za-z0-9]{6,12}$/;

    if (username.value.toUpperCase() === password.value.toUpperCase()) {
      alert("USER NAME 과 비밀번호는 같으면 안됩니다.");
      password.focus();
      return false;
    }
    if (passRule.test(password.value) === false) {
      alert("비밀번호 규칙을 지키세요.");
      password.focus();
      return false;
    }
    if (password.value === "") {
      alert("비밀번호를 입력하세요");
      password.focus();
    }

    if (re_password.value === "") {
      alert("비밀번호를 입력하세요2");
      re_password.focus();
    }

    if (password.value !== re_password.value) {
      alert("비밀번호가 일치하지 않습니다.");

      password.focus();
      return false;
    }

    const emailRule =
      /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;

    if (emailRule.test(email.value) === false) {
      alert("이메일 규칙을 지키세요.");
      email.focus();
      return false;
    }
    document.querySelector("form.join")?.submit();
  });
});
