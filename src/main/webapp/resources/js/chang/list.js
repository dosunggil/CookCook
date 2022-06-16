document.addEventListener("DOMContentLoaded", () => {
  const section_colum = document.querySelector("div.ch-main");

  const button_list = document.querySelector("button.ch-button-list");

  console.log("불러오기 성공");

  section_colum?.addEventListener("click", (e) => {
    console.log("클릭 성공");
    const targget = e.target;
    const section = targget.closest("section.section-colum");
    const postseq = section.dataset.postseq;
    document.location.href = `${rootPath}/detail/${postseq}`;
  });

  button_list?.addEventListener("click", () => {
    document.location.href = `${rootPath}/list`;
  });
});
