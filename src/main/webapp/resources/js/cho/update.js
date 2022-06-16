document.addEventListener("DOMContentLoaded", () => {
  const username = document.querySelector("input.cho-nickname");
  const form = document.querySelector("form.cho-form-update");
  const btn = document.querySelector("button.cho-btn-update");

  if (btn) {
    btn.addEventListener("click", () => {
      if (username.value === "") {
        username.placeholder = "이름을 입력하세요";
        username.focus();
        return false;
      }
      form.submit();
    });
  }
});
