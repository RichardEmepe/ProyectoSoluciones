//desactivando todas las opciones
var arregloOpciones = document.getElementsByClassName("opMenu");
for(var i=0; i<arregloOpciones.length;i++){
    arregloOpciones[i].className = "nav-link opMenu";
}

//activar la opcion de categoria
var opcion = document.getElementById("opDoctores");
opcion.className += " activado";

document.querySelectorAll(".editarDoctor").forEach(i => i.addEventListener("click", e =>{
        document.getElementById('txtDNI').value = i.dataset.dni;
        document.getElementById('txtNombres').value = i.dataset.nombres;
        document.getElementById('txtApellidos').value = i.dataset.apellidos;

        var myModal = new bootstrap.Modal(document.getElementById('modalEditar'))
        myModal.show();

    }
))
