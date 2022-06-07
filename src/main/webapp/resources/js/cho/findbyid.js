document.addEventListener("DOMContentLoaded", () => {
  const list_container = document.querySelector("div.cho-list-container");

  list_container?.addEventListener("click", (e) => {
    const targget = e.target;
    const tr = targget.closest("div.cho-list-box");
    const nm = tr.dataset.nm;
    //alert(seq);
    document.location.href = `${rootPath}/cho/${nm}/detail`;
  });
});
