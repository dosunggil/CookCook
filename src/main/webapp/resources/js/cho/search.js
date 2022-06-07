// document.addEventListener("DOMContentLoaded", () => {
//   const modal_box = document.querySelector("#modal-box");
//   const recipe_title = document.querySelector("input#title");

//   recipe_title?.addEventListener("keypress", (e) => {
//     if (e.keyCode === 13) {
//       fetch(`${rootPath}/cho/recipes?title=${e.target.value}`)
//         .then((res) => res.text())
//         .then((result) => {
//           console.log(result);
//         });
//     }
//   });
// });
