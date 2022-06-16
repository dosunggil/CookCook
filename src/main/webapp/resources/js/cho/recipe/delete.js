document.addEventListener("DOMContentLoaded", () => {
  const list_container = document.querySelector("div.cho-myrecipe-list");
  const btn_delete = document.querySelector("div.cho-btn-delete");

  btn_delete?.addEventListener("click", (e) => {
    const targget = e.target;
    const tr = targget.closest("div.cho-myrecipe-list");
    const RCP_SEQ = tr.dataset.seq;

    document.location.href = `${rootPath}/cho/${RCP_SEQ}/delete`;
  });
});
