document.addEventListener("DOMContentLoaded", () => {
  const list_container = document.querySelector("div.cho-list-container");

  list_container?.addEventListener("click", (e) => {
    const targget = e.target;
    const tr = targget.closest("div.cho-list-box");
    const seq = tr.dataset.seq;
    const nm = tr.dataset.nm;
    //const dtls = tr.dataset.dtls;
    //alert(seq);
    document.location.href = `${rootPath}/cho/post/${seq}/${nm}/detail`;
  });
});
