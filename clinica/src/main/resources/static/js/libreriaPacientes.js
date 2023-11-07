//desactivando todas las opciones
var arregloOpciones = document.getElementsByClassName("opMenu");
for(var i=0; i<arregloOpciones.length;i++){
    arregloOpciones[i].className = "nav-link opMenu";
}

//activar la opcion de categoria
var opcion = document.getElementById("opPacientes");
opcion.className += " activado";

//Mostrar el modal
document.querySelectorAll(".editarPaciente").forEach(i => i.addEventListener("click", e =>{
        document.getElementById('txtDNI').value = i.dataset.dni;
        document.getElementById('txtNombres').value = i.dataset.nombres;
        document.getElementById('txtApellidos').value = i.dataset.apellidos;
        document.getElementById('txtTelefono').value = i.dataset.telefono;

        var myModal = new bootstrap.Modal(document.getElementById('modalEditar'))
        myModal.show();

    }
))


