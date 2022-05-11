document.addEventListener("DOMContentLoaded", () => {
  const login = document.querySelector("div.btn-login");

  if (login) {
    login.addEventListener("click", () => {
      alert("11");
      let url = `${rootPath}`;
      url += "/log";
      document.location.href = url;
    });
  }
});
