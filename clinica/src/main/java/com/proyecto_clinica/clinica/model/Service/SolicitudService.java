package com.proyecto_clinica.clinica.model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto_clinica.clinica.model.DAO.ISolicitudDAO;
import com.proyecto_clinica.clinica.model.Entidades.Solicitudes;
import com.proyecto_clinica.clinica.model.Service.IService.ISolicitudService;

@Service
public class SolicitudService implements ISolicitudService{
    @Autowired
    private ISolicitudDAO solicitudDAO;


    @Override
    public void registrarSolicitud(Solicitudes solicitudes) {
        solicitudDAO.save(solicitudes);
    }

    @Override
    public List<Solicitudes> listarSolicitudes() {
        return (List<Solicitudes>) solicitudDAO.findAll();
    }
    

}
