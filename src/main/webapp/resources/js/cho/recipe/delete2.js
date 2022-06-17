function AAA() {
  if (!confirm("삭제?")) {
    console.log("취소");
    return false;
  } else {
    const tr = document.querySelector("input.cho-last-code");
    const RCP_SEQ = tr.dataset.seq;
    document.location.href = `${rootPath}/cho/${RCP_SEQ}/delete`;
  }
}
