function AAA() {
  if (!confirm("삭제?")) {
    console.log("취소");
    return false;
  } else {
    const btn_delete = document.querySelector("button.cho-btn-delete");
    const tr = btn_delete.closest("div.cho-myrecipe-list");
    const RCP_SEQ = tr.dataset.seq;
    document.location.href = `${rootPath}/cho/${RCP_SEQ}/delete`;
  }
}
