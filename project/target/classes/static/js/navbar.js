let navbar = document.getElementById("navbar");

// STATIC BUTTONS
let span1 = document.createElement("span");
span1.id = "navbar_static";

function createLi(text, link) {
    let li = document.createElement("li");
    let a = document.createElement("a");
    a.innerHTML = text;
    a.href = link;
    li.append(a);
    return li;
}

span1.append(createLi("HOME",    "/home"));
span1.append(createLi("ITEMS",   "/items"));
span1.append(createLi("USERS",   "/users"));
span1.append(createLi("AUTHORS", "/authors"));
span1.append(createLi("GENRES",  "/genres"));

navbar.append(span1);

// DYNAMIC BUTTONS
let span2 = document.createElement("span");
span2.id = "navbar_dynamic";
navbar.append(span2);

async function load_dynamic() {
    const response = await fetch("/api/myaccount");

    if (response.ok) {
        const jsonData = await response.json();
        span2.append(createLi("MY ACCOUNT", "/myaccount"));
        span2.append(createLi("LOGOUT",    "/logout"));
    }
    else {
        span2.append(createLi("LOGIN",    "/login"));
        span2.append(createLi("REGISTER", "/register"));
    }
}

load_dynamic();



