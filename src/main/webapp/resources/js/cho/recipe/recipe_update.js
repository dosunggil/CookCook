document.addEventListener("DOMContentLoaded", () => {
  const list_container = document.querySelector("div.cho-myrecipe-middle");

  list_container?.addEventListener("click", (e) => {
    console.log("수정하기 클릭");
    const targget = e.target;
    const tr = targget.closest("div.cho-myrecipe-list");
    const seq = tr.dataset.seq;
    // const nm = tr.dataset.nm;

    document.location.href = `${rootPath}/cho/recipe/${seq}/insertUpdate`;
  });
});
