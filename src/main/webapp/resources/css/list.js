document.addEventListener("DOMContentLoaded", () => {
  const search = document.querySelector("button.btn-search");
  search.addEventListener("click", () => {
    let url = `${rootPath}`;
    const searchContent = document.querySelector("input[name='search']").value;
    if (searchContent) {
      alert(searchContent);
    }
  });
});
