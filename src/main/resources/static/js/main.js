$(document).ready(function(){
    $('#usersTable').DataTable({
        lengthMenu: [[5, 10, 25, 50, -1], [5, 10, 25, 50, "Todos"]],
        order: [[0, 'asc']],
    });

    $("#add-cartorio").on("click", loadCartoriosForm);

    $(".table td").on("click", loadBubbleHandler);
});

// Functions

function loadCartoriosForm () {
    window.location.replace("http://localhost:8080/addCartorio");
}

function loadBubbleHandler (event) {
    if( event.target.innerHTML == "Atualizar" ) {
        loadCartorioUpdateForm($(this).parent("tr").children().first().find("span").text());
    } else {
        loadCartorioDelete();
    }
}

function loadCartorioUpdateForm (cartorioName) {
    window.location.replace("http://localhost:8080/updateCartorio/" + cartorioName);
    return;
}

function loadCartorioDelete () {
    console.log("GOT HERE");
    return;
}