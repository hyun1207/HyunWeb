/* 공용 JS */
$(document).ready(function(){
    /* SideBar Click */
    let menuBtn = document.querySelector(".bx-menu");
    console.log(menuBtn);
    let sidebar = document.querySelector(".ctSideBarWrap");
    console.log(sidebar);
    menuBtn.addEventListener("click", function(){
        sidebar.classList.toggle("menuclose");
    })
})

