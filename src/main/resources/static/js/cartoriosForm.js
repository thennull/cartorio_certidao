$(document).ready(function () {
  $("#cancel").on("click", loadHome);
});

// Functions

function loadHome() {
    window.location.replace("http://localhost:8080/");
}
