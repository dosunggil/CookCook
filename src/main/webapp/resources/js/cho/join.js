document.addEventListener("DOMContentLoaded", () => {
  const username = document.querySelector("#username");
  const password = document.querySelector("#password");
  const re_password = document.querySelector("#re_password");
  const email = document.querySelector("#email");
  const btn_join = document.querySelector("#btn-join");

  const div_index = {
    username: 0,
    password: 1,
    re_password: 2,
    email: 3,
    name: 4,
    nickname: 5,
  };

  const error_divs = document.querySelectorAll("div.error");
  const passRule = /^[A-Za-z0-9]{6,12}$/;
  const emailRule =
    /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;

  const error_msg = (div, message) => {
    div.classList.remove("w3-text-blue");
    div.classList.add("w3-text-red");
    div.innerText = message;
  };

  const ok_msg = (div, message) => {
    div.classList.remove("w3-text-red");
    div.classList.add("w3-text-blue");
    div.innerText = message;
  };

  password?.addEventListener("input", (e) => {
    const current = e.currentTarget;
    const error = error_divs[div_index.password];
    if (!passRule.test(current.value)) {
      const msg = "* 비밀번호 규칙을 준수하세요";
      error_msg(error, msg);
    } else {
      const msg = "* 사용 가능한 비밀번호입니다.";
      ok_msg(error, msg);
    }
  });

  re_password?.addEventListener("input", (e) => {
    const current = e.currentTarget;
    const error = error_divs[div_index.re_password];
    if (current.value === password?.value) {
      const msg = " * 비밀번호가 일치합니다.";
      ok_msg(error, msg);
    } else {
      const msg = " * 비밀번호가 일치하지 않습니다.";
      error_msg(error, msg);
    }
  });

  email?.addEventListener("input", (e) => {
    const current = e.currentTarget;
    const error = error_divs[div_index.email];
    if (emailRule.test(current.value)) {
      const msg = " * 사용 가능한 이메일 주소입니다.";
      ok_msg(error, msg);
    } else {
      const msg = " * 이메일 규칙을 준수하세요.";
      error_msg(error, msg);
      // 이메일 양식검사를 통과하지 못하면 다음 코드를 실행하지 않도록 한다
      return false;
    } //양식검사 end

    fetch(`${rootPath}/cho/user/emailcheck?email=${current.value}`)
      .then((res) => res.text())
      .then((result) => {
        if (result === "OK") {
          const msg = " * 사용 가능한 이메일 주소입니다.";
          ok_msg(error, msg);
        } else {
          const msg = " * 이미 사용중인 이메일 주소입니다.";
          error_msg(error, msg);
          current.focus();
        }
      });
  });

  /*
    input box 에서 focus 가 벗어났을 때 발생하는 event
    focusout, blur
    focusout 은 이벤트 버블링이 심하게 발생한다.
    js 코드에서는 주로 blur 를 사용한다.

  */
  username?.addEventListener("blur", (e) => {
    const current = e.currentTarget;
    const username_div = error_divs[div_index.username];
    if (current.value === "") {
      const msg = " * USER NAME 은 반드시 입력하세요.";
      error_msg(username_div, msg);
      current.focus();
      return false;
    }
    // 중복검사 수행하기
    fetch(`${rootPath}/cho/user/idcheck/${current.value}`)
      .then((res) => res.text())
      .then((result) => {
        if (result === "OK") {
          const msg = " * 사용 가능합니다.";
          ok_msg(username_div, msg);
        } else {
          const msg = " * 이미 사용중인 ID 입니다.";
          error_msg(username_div, msg);
          username.focus();
        }
      });
  });

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

    if (emailRule.test(email.value) === false) {
      alert("이메일 규칙을 지키세요.");
      email.focus();
      return false;
    }
    document.querySelector("form.join")?.submit();
  });
});
