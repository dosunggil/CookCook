document.addEventListener("DOMContentLoaded", () => {
  const btn_insert = document.querySelector("button.ch-button-insert");
  const btn_update = document.querySelector("button.ch-button-update");
  const form = document.querySelector("form.ch-content-input");

  btn_update?.addEventListener("click", () => {
    console.log("수정하기 클릭");
    const tr = document.querySelector("article.content_in");
    const seq = tr.dataset.seq;
    document.location.href = `${rootPath}/cho/recipe/${seq}/insertUpdate`;
  });

  btn_insert?.addEventListener("click", () => {
    console.log("수정하기 클릭");
    form.submit();
  });
});
