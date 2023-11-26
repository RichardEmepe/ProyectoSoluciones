//desactivando todas las opciones
var arregloOpciones = document.getElementsByClassName("opMenu");
for(var i=0; i<arregloOpciones.length;i++){
    arregloOpciones[i].className = "nav-link opMenu";
}

//activar la opcion de categoria
var opcion = document.getElementById("opAdministradores");
opcion.className += " activado";

document.querySelectorAll(".asignarRol").forEach(i => i.addEventListener("click", e =>{
    document.getElementById('txtIduser').value = i.dataset.iduser;
    document.getElementById('txtUsername').value = i.dataset.username;

    var myModal = new bootstrap.Modal(document.getElementById('modalAsignar'))
    myModal.show();

}
))