document.addEventListener("DOMContentLoaded", () => {
  const search = document.querySelector("button.btn-search");

  if (search) {
    search.addEventListener("click", () => {
      alert("11");
      let url = `${rootPath}`;
      url += "/list";
      document.location.href = url;
    });
  }
});
