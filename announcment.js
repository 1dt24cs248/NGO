let announcements = [
"Food Distribution Camp on 20 April",
"Solar Energy Workshop on 5 May",
"Tree Plantation Drive on 15 May"
];

for(let i=0;i<announcements.length;i++){
    console.log(announcements[i]);
}
// Hamburger Menu
const hamburger = document.getElementById("hamburger");
const sideMenu = document.getElementById("sideMenu");
const closeMenu = document.getElementById("closeMenu");

if (hamburger) {
    hamburger.onclick = () => {
        sideMenu.style.right = "0";
    };
}

if (closeMenu) {
    closeMenu.onclick = () => {
        sideMenu.style.right = "-100%";
    };
}

// Smooth Scroll
document.querySelectorAll('a[href^="#"]').forEach(anchor => {
    anchor.addEventListener("click", function (e) {
        e.preventDefault();

        document.querySelector(this.getAttribute("href")).scrollIntoView({
            behavior: "smooth"
        });

        if (sideMenu) {
            sideMenu.style.right = "-100%";
        }
    });
});

// Header Shadow
const header = document.getElementById("header");

window.addEventListener("scroll", () => {

    if (window.scrollY > 50) {
        header.style.boxShadow = "0 5px 20px rgba(0,0,0,.15)";
    } else {
        header.style.boxShadow = "none";
    }

});
const images = [
    "Images/gallery1.jpg",
    "Images/gallery2.jpg",
    "Images/gallery3.jpg",
    "Images/gallery4.jpg"
];

let current = 0;

function nextImage() {

    current++;

    if (current >= images.length) {
        current = 0;
    }

    document.getElementById("galleryImage").src = images[current];
}

setInterval(nextImage, 3000);
