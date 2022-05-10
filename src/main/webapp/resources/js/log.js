document.addEventListener("DOMContentLoaded", () => {
  const login = document.querySelector("button.login");
  if (login) {
    login.addEventListener("click", () => {
      const show = document.querySelector("p.show");
      show.style.display = "block";
      login.style.transform = "translate(0, 30%)";
      const id = document.querySelector("input.id");
      id.focus();
    });
  }
});
