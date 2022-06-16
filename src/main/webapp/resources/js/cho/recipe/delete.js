document.addEventListener("DOMContentLoaded", () => {
  const btn_delete = document.querySelector("button.cho-btn-delete");

  btn_delete?.addEventListener("click", (e) => {
    const targget = e.target;
    const tr = targget.closest("div.cho-myrecipe-list");
    const RCP_SEQ = tr.dataset.seq;

    document.location.href = `${rootPath}/cho/${RCP_SEQ}/delete`;
  });
});
