document.addEventListener("DOMContentLoaded", () => {
  const addmanual = document.querySelector("button.add-input");
  const deletemanual = document.querySelector("button.delete-input");
  const button_register = document.querySelector("button.ch-button-register");
  addmanual?.addEventListener("click", () => {});

  deletemanual?.addEventListener("click", () => {});

  button_register?.addEventListener("click", () => {
    const ATT_FILE_NO_MK = document.querySelector("input.ATT_FILE_NO_MK"); //이미지경로(대)
    const RCP_NM = document.querySelector("input.RCP_NM"); // 메뉴명
    const rcp_content = document.querySelector("textarea.rcp_content"); // 내용
    const info_eng = document.querySelector("input.rcp_parts-dtls"); // 재료정보
    // 별점, 해쉬태그
    const manuals = document.querySelectorAll("input.manual");
    const imgs = document.querySelectorAll("input.manual_img");

    const username = "asdf"; // 임시로 만듬
  });
});
