//desactivando todas las opciones
var arregloOpciones = document.getElementsByClassName("opMenu");
for(var i=0; i<arregloOpciones.length;i++){
    arregloOpciones[i].className = "nav-link opMenu";
}

//activar la opcion de categoria
var opcion = document.getElementById("opPacientes");
opcion.className += " activado";

var btnAgendarBuscado = document.getElementById('buttonAgendar')
var btnEditarBuscado = document.getElementById('buttonEditar')
var btnEliminarBuscado = document.getElementById('buttonEliminar')

var dniEncontrado = document.getElementById('dniEncontrado')
if (dniEncontrado.innerHTML.trim() === ''){
    btnAgendarBuscado.style.pointerEvents = 'none';
    btnEditarBuscado.style.pointerEvents = 'none';
    btnEliminarBuscado.style.pointerEvents = 'none';
}else{
    btnAgendarBuscado.style.pointerEvents = 'auto';
    btnEditarBuscado.style.pointerEvents = 'auto';
    btnEliminarBuscado.style.pointerEvents = 'auto';
}


//Mostrar el modal
document.querySelectorAll(".editarPaciente").forEach(i => i.addEventListener("click", e =>{
        document.getElementById('txtDNI').value = i.dataset.dni;
        document.getElementById('txtNombres').value = i.dataset.nombres;
        document.getElementById('txtApellidos').value = i.dataset.apellidos;
        document.getElementById('txtTelefono').value = i.dataset.telefono;
        document.getElementById('txtPassw').value = i.dataset.passw;

        var myModal = new bootstrap.Modal(document.getElementById('modalEditar'))
        myModal.show();

    }
))

document.querySelectorAll(".editarPacienteBuscado").forEach(i => i.addEventListener("click", e =>{
    document.getElementById('txtDNI').value = i.dataset.dnibuscado;
    document.getElementById('txtNombres').value = i.dataset.nombrebuscado;
    document.getElementById('txtApellidos').value = i.dataset.apellidobuscado;
    document.getElementById('txtTelefono').value = i.dataset.telefonobuscado;
    document.getElementById('txtPassw').value = i.dataset.passwbuscado;

    var myModal = new bootstrap.Modal(document.getElementById('modalEditar'))
    myModal.show();

}
))

document.querySelectorAll(".agendarCitaPaciente").forEach(i => i.addEventListener("click", e =>{
    document.getElementById('txtDNICita').value = i.dataset.dni;
    document.getElementById('txtNombresCita').value = i.dataset.nombres + " " + i.dataset.apellidos;


    var myModal = new bootstrap.Modal(document.getElementById('modalAgendarCita'))
    myModal.show();

}
))

document.querySelectorAll(".agendarCitaBuscado").forEach(i => i.addEventListener("click", e =>{
    document.getElementById('txtDNICita').value = i.dataset.dnibuscado;
    document.getElementById('txtNombresCita').value = i.dataset.nombrebuscado + " " + i.dataset.apellidobuscado;


    var myModal = new bootstrap.Modal(document.getElementById('modalAgendarCita'))
    myModal.show();

}
))
