document.addEventListener("DOMContentLoaded", () => {
  const login = document.querySelector("button.login");
  const signup = document.querySelector("li.signup");
  const search_pass = document.querySelector("li.search_pass");
  const search_id = document.querySelector("li.search_id");
  const logo = document.querySelector("img.logo");

  if (login) {
    login.addEventListener("click", () => {
      const show = document.querySelector("p.show");
      show.style.display = "block";
      login.style.transform = "translate(0, 30%)";
      const id = document.querySelector("input.id");
      id.focus();
    });
  }
  if (signup) {
    signup.addEventListener("click", () => {
      let url = `${rootPath}`;
      url += "/ahn/user/join";
      document.location.href = url;
    });
  }
  if (search_pass) {
    signup.addEventListener("click", () => {
      let url = `${rootPath}`;
      url += "/ahn/user/join";
      document.location.href = url;
    });
  }
  if (search_id) {
    signup.addEventListener("click", () => {
      let url = `${rootPath}`;
      url += "/ahn/user/join";
      document.location.href = url;
    });
  }
  if (logo) {
    logo.addEventListener("click", () => {
      let url = `${rootPath}`;
      url += "/";
      document.location.href = url;
    });
  }
});
