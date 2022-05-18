document.addEventListener("DOMContentLoaded", () => {
  const login = document.querySelector("div.btn-login");
  const search = document.querySelector("button.btn-search");
  const go_home = document.querySelector("div.btn-go-home");
  const btn_open = document.querySelector("div.btn-open");
  const btn_theme = document.querySelector("div.btn-theme");

  const drop_menu = document.querySelector("div.drop-menu");
  const main = document.querySelector("main");
  const header = document.querySelector("header");
  const footer = document.querySelector("footer");
  const search_box = document.querySelector(".btn-search");
  const search_btn = document.querySelector("button.btn-search");

  if (btn_theme) {
    btn_theme.addEventListener("click", () => {
      const dark_theme_main = main.className;
      if (dark_theme_main === "") {
        main.classList.add("dark-theme-body");
        search_btn.classList.add("dark-theme-search");
        header.classList.add("dark-theme-header");
        footer.classList.add("dark-theme-header");
        search_box.classList.add("dark-theme-search");
        drop_menu.classList.add("dark-theme-drop");
      } else {
        main.classList.remove("dark-theme-body");
        header.classList.remove("dark-theme-header");
        footer.classList.remove("dark-theme-header");
        search_box.classList.remove("dark-theme-search");
        search_btn.classList.remove("dark-theme-search");
        drop_menu.classList.remove("dark-theme-drop");
      }
    });
  }

  if (btn_open) {
    btn_open.addEventListener("click", () => {
      // const visibility = drop_menu.style.visibility;
      // const visi = btn_open.getAttribute("visibility");
      const visibility = drop_menu.className;
      if (
        visibility == "drop-menu" ||
        visibility === "drop-menu dark-theme-drop"
      ) {
        console.log("안녕");
        drop_menu.classList.add("visibility");
      } else {
        drop_menu.classList.remove("visibility");
      }

      // console.log(visibility);
      //  = "visible";
      // drop_menu.style.opacity = "1";
    });

    // if (btn_open.getAttribute("visibility") == "visible") {
    //   btn_open.addEventListener("click", () => {
    //     drop_menu.style.visibility = "hidden";
    //     drop_menu.style.opacity = "0";
    //   });
    // }
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
      console.log("검색");
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
