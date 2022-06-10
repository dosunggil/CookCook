document.addEventListener("DOMContentLoaded", () => {
  const id_check = document.querySelector("button.btn-idA");
  const nick_check = document.querySelector("button.btn-nickA");
  const join_btn = document.querySelector("button.btn-sign");
  const join_form = document.querySelector("form.join");

  const index = {
    name: 0,
    username: 1,
    nickname: 2,
    email: 3,
    password: 4,
    re_password: 5,
  };
  // form.join 내부에 있는 모든 input box
  // SelectAll을 사용하면 tag 요소들을 배열로 가져온다
  const inputList = document.querySelectorAll("form.join input");

  // 숫자와 문자를 포함하는 6자리 ~ 12자리의 문자열 검사패턴
  const passRule = /^[A-Za-z0-9]{6,12}$/;
  // 이메일 형식 검사
  const emailRule =
    /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;

  // inputList 에는 0번요소부터 4번요소까지
  // form태그에 작성된 순서대로 담겨있다
  // index 객체에서 각 요소의 첨자를 가져오고
  // 첨자를 사용하여 input tag를 각 순서대로 변수에 담겠다
  const username = inputList[index.username];
  const password = inputList[index.password];
  const re_password = inputList[index.re_password];
  const name = inputList[index.name];
  const email = inputList[index.email];
  const nickname = inputList[index.nickname];

  const username_msg = document.querySelector("div.username1");
  const nickname_msg = document.querySelector("div.nickname1");

  const username_isBlank = () => {
    username_msg.classList.remove("ok");

    /*
      JS 코드를 사용하여 여러가지 style을 변경하고자 할 때
      일일이 style 항목을 변경하는 방법이 있지만
      미리 본문의 style 항목에 사용하지 않는 class 하나 만들어 두고
      속성을 미리 작성해 놓는다
      그리고 해당 항목에 classList.add("class 명") 과 같이
      사용하면 여러가지 미리 설정한 속성이 적용된다
  
      username_msg.style.color = "red";
      username_msg.style.fontWeight = "900";
      username_msg.style.textDecoration = "underline";
      */
    // div.username 항목에 warn이라는 class를 덧붙여라
    username_msg.classList.add("warn");
    username_msg.innerText = " * ID를 입력해주세요";
    username_msg.style.color;
    username.focus();
    return false;
  };
  const nickname_isBlank = () => {
    nickname_msg.classList.remove("ok");

    /*
      JS 코드를 사용하여 여러가지 style을 변경하고자 할 때
      일일이 style 항목을 변경하는 방법이 있지만
      미리 본문의 style 항목에 사용하지 않는 class 하나 만들어 두고
      속성을 미리 작성해 놓는다
      그리고 해당 항목에 classList.add("class 명") 과 같이
      사용하면 여러가지 미리 설정한 속성이 적용된다
  
      username_msg.style.color = "red";
      username_msg.style.fontWeight = "900";
      username_msg.style.textDecoration = "underline";
      */
    // div.username 항목에 warn이라는 class를 덧붙여라
    nickname_msg.classList.add("warn");
    nickname_msg.innerText = " * 닉네임을 입력해주세요";
    nickname_msg.style.color;
    nickname.focus();
    return false;
  };

  // join button 클릭
  if (join_btn) {
    join_btn.addEventListener("click", () => {
      if (name.value === "") {
        alert("이름을 입력해 주세요");
        name.focus();
        return false;
      }
      if (username.value === "") {
        alert("아이디를 입력해 주세요");
        username.focus();
        return false;
      }
      if (nickname.value === "") {
        alert("닉네임을 입력해 주세요");
        nickname.focus();
        return false;
      }
      if (email.value === "") {
        alert("이메일을 입력해 주세요");
        email.focus();
        return false;
      }
      if (password.value === "") {
        alert("비밀번호를 입력해 주세요");
        password.focus();
        return false;
      }
      if (username.value.toUpperCase() === password.value.toUpperCase()) {
        alert("ID와 비밀번호는 같을수 없습니다");
        password.focus();
        return false;
      }
      if (re_password.value === "") {
        alert("비밀번호 확인을 입력해 주세요");
        re_password.focus();
        return false;
      }
      if (passRule.test(password.value) === false) {
        alert(
          "비밀번호는 영문자, 숫자 포함 \n6자리 ~ 12자리의 문자열 까지 입력하세요"
        );
        password.focus();
        return false;
      }

      if (password.value !== re_password.value) {
        alert("비밀번호와 비밀번호 확인 값이 서로 다릅니다");
        password.value = "";
        re_password.value = "";
        password.focus();
        return false;
      }
      if (email.value === "") {
        alert("비밀번호를 입력해 주세요");
        email.focus();
        return false;
      }
      if (!emailRule.test(email.value)) {
        alert("이메일 형식이 잘못되었습니다(*@* 형식) 다시 입력해주세요");
        email.focus();
        return false;
      }

      // 유효성 검사 종료
      // form에 담긴 데이터를 서버로 전송한다
      join_form.submit();
    });
  }

  if (id_check) {
    id_check.addEventListener("click", () => {
      if (username.value === "") {
        username_isBlank();
        return false;
      }
      fetch(`${rootPath}/ahn/user/idcheck?username=${username.value}`)
        .then((res) => {
          console.table(index);
          console.table(res);
          return res.text();
        })
        .then((result) => {
          if (result === "OK") {
            console.log("ok출력");
            username_msg.classList.remove("warn");
            username_msg.classList.add("ok");
            username_msg.innerText = " * 사용할 수 있는 ID 입니다";
          } else {
            username_msg.classList.remove("ok");
            username_msg.classList.add("warn");
            username_msg.innerText = " * 이미 가입된 ID 입니다";
          }
        });
    });
  }

  if (nick_check) {
    nick_check.addEventListener("click", () => {
      if (username.value === "") {
        nickname_isBlank();
        return false;
      }

      fetch(`${rootPath}/ahn/user/nicknamecheck?nickname=${nickname.value}`)
        .then((res) => {
          console.table(index);
          console.table(res);
          return res.text();
        })
        .then((result) => {
          if (result === "OK") {
            console.log("ok출력");
            nickname_msg.classList.remove("warn");
            nickname_msg.classList.add("ok");
            nickname_msg.innerText = " * 사용할 수 있는 닉네임 입니다";
          } else {
            nickname_msg.classList.remove("ok");
            nickname_msg.classList.add("warn");
            nickname_msg.innerText = " * 이미 가입된 닉네임 입니다";
          }
        });
    });
  }
});
