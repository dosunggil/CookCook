document.addEventListener("DOMContentLoaded", () => {
  const login = document.querySelector("button.login");
  const signup = document.querySelector("li.signup");
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
      url += "/signup";
      document.location.href = url;
    });
  }
});
