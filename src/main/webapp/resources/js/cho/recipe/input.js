document.addEventListener("DOMContentLoaded", () => {

    const btn_save = document.querySelector("button.btn-save-recipe");

    const inputs = document.querySelectorAll("input");

    const input_index = {
        dtlssearch : 0,
        search : 1,
        username : 2,
        title : 3,
        content :4,
        img :5,
        eng :6,
        dtls :7,
        hashtag :8,
    }
    btn_save?.addEventListener("click", (btn) => {
        const title = inputs[input_index.title];
        const content = inputs[input_index.content];
    
        if (title?.value === "") {
          alert("요리 이름은 반드시 입력하세요.");
          title.focus();
          return false;
        }
      
        if (content?.value === "") {
          alert("요리 설명은 반드시 입력하세요.");
          content.focus();
          return false;
        }
    
        // click event 가 발생한 tag 에서 가장 가까운 form 을 추출하기
        const form = btn.currentTarget.closest("FORM");
        form.submit();
      });
});
