document.addEventListener("DOMContentLoaded", () => {
  const login = document.querySelector("div.btn-login");
  const search = document.querySelector("button.btn-search");
  const go_home = document.querySelector("div.btn-go-home");

  const btn_open = document.querySelectorAll("div.btn-open");
  const hidden_box = document.querySelectorAll("div.hidden-box");

  const list_box = document.querySelector(".list_box");

  if (btn_open[0]) {
    btn_open[0].addEventListener("click", () => {
      // const visibility = drop_menu.style.visibility;
      // const visi = btn_open.getAttribute("visibility");
      const visibility = hidden_box[0].className;
      if (
        visibility == "hidden-box" ||
        visibility === "hidden-box dark-theme-drop"
      ) {
        hidden_box[0].classList.add("visibility");
      } else {
        hidden_box[0].classList.remove("visibility");
      }

      // console.log(visibility);
      //  = "visible";
      // drop_menu.style.opacity = "1";
    });
  }

  if (btn_open[1]) {
    btn_open[1].addEventListener("click", () => {
      // const visibility = drop_menu.style.visibility;
      // const visi = btn_open.getAttribute("visibility");
      const visibility = hidden_box[1].className;
      if (
        visibility == "hidden-box" ||
        visibility === "hidden-box dark-theme-drop"
      ) {
        hidden_box[1].classList.add("visibility");
      } else {
        hidden_box[1].classList.remove("visibility");
      }
    });
  }

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
