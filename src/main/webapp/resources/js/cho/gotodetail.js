document.addEventListener("DOMContentLoaded", () => {
  const list_container = document.querySelector("div.cho-list-container");
  const list_container_ver2 = document.querySelector(
    "div.cho-list-containerVer2"
  );

  list_container?.addEventListener("click", (e) => {
    const targget = e.target;
    const tr = targget.closest("div.cho-list-box");
    const seq = tr.dataset.seq;
    const nm = tr.dataset.nm;
    //const dtls = tr.dataset.dtls;
    //alert(seq);
    document.location.href = `${rootPath}/cho/post/${seq}/${nm}/detail`;
  });

  list_container_ver2?.addEventListener("click", (e) => {
    const targget = e.target;
    const tr = targget.closest("div.cho-list-boxVer2");
    const seq = tr.dataset.seq;
    const nm = tr.dataset.nm;
    //const dtls = tr.dataset.dtls;
    //alert(seq);
    document.location.href = `${rootPath}/cho/post/${seq}/${nm}/detail`;
  });
});
