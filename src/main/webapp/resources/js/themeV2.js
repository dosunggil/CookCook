document.addEventListener("DOMContentLoaded", () => {
  const btn_theme = document.querySelector("div.btn-theme");

  const main = document.querySelector("main");
  const header = document.querySelector("header");
  const footer = document.querySelector("footer");
  const search_box = document.querySelector(".btn-search");
  const search_btn = document.querySelector("button.btn-search");
  const drop_menu = document.querySelector("div.drop-menu");

  if (btn_theme) {
    btn_theme.addEventListener("click", () => {
      const dark_theme_main = main.className;
      if (dark_theme_main === "") {
        main.classList.add("dark-theme-body");
        header.classList.add("dark-theme-header", "dark-theme-bold");
        footer.classList.add("dark-theme-footer", "dark-theme-bold");
        search_box.classList.add("dark-theme-bold");
        search_btn.classList.add("dark-theme-bold");
        drop_menu.classList.add("dark-theme-drop");
      } else {
        main.classList.remove("dark-theme-body");
        header.classList.remove("dark-theme-header", "dark-theme-bold");
        footer.classList.remove("dark-theme-footer", "dark-theme-bold");
        search_box.classList.remove("dark-theme-bold");
        search_btn.classList.remove("dark-theme-bold");
        drop_menu.classList.remove("dark-theme-drop");
      }
    });
  }
});
