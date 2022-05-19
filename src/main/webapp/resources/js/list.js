document.addEventListener("DOMContentLoaded", () => {
  const section_colum = document.querySelector(".section-colum");

  if (section_colum) {
    section_colum.addEventListener("click", () => {
      let url = `${rootPath}`;
      url += "/detail";
      document.location.href = url;
    });
  }
});
