const navMenuButton = document.querySelector(".nav-menu-button");
const nav = document.querySelector("nav");

navMenuButton.onmouseover = () => {
    nav.classList.remove("nav-invisible");
/* on 뒤에 전부 소문자 */
}
navMenuButton.onmouseout = () => {
    nav.classList.add("nav-invisible");

}


nav.onmouseover = () => {
    nav.classList.remove("nav-invisible");
/* on 뒤에 전부 소문자 */
}

nav.onmouseout = () => {
    nav.classList.add("nav-invisible");

}
