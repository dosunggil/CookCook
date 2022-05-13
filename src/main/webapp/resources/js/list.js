document.addEventListener("DOMContentLoaded", () => {
  const section_colum = document.querySelector(".section-colum");

  if (section_colum) {
    document.addEventListener("click", () => {
      let url = `${rootPath}`;
      url += "/listDetail";
      document.location.href = url;
    });
  }
});
