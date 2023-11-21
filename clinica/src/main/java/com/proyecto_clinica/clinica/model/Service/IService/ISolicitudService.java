package com.proyecto_clinica.clinica.model.Service.IService;

import java.util.List;
import com.proyecto_clinica.clinica.model.Entidades.Solicitudes;

public interface ISolicitudService {
    public void registrarSolicitud(Solicitudes solicitudes);
    public List<Solicitudes> listarSolicitudes();
}
