//desactivando todas las opciones
var arregloOpciones = document.getElementsByClassName("opMenu");
for(var i=0; i<arregloOpciones.length;i++){
    arregloOpciones[i].className = "nav-link opMenu";
}

//activar la opcion de categoria
var opcion = document.getElementById("opCitas");
opcion.className += " activado";

document.querySelectorAll(".asignarDoctor").forEach(i => i.addEventListener("click", e =>{
    document.getElementById('txtNroCita').value = i.dataset.nrocita;
    document.getElementById('txtFecha').value = i.dataset.fecha;
    document.getElementById('txtHora').value = i.dataset.hora;
    document.getElementById('txtN_espec').value = i.dataset.n_espec;
    document.getElementById('txtEspec').value = i.dataset.espec;
    document.getElementById('txtDNIpa').value = i.dataset.dnipa;
    document.getElementById('txtNombresCompletos').value = i.dataset.nombres + " " + i.dataset.apellidos;

    var myModal = new bootstrap.Modal(document.getElementById('modalAsignar'))
    myModal.show();

}
))