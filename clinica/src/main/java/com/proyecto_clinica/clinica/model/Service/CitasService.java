package com.proyecto_clinica.clinica.model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto_clinica.clinica.model.DAO.ICitasDAO;
import com.proyecto_clinica.clinica.model.Entidades.Citas;

@Service
public class CitasService implements ICitasService{
    
    @Autowired
    private ICitasDAO citasDAO;

    @Override
    public void registrarCita(Citas citas) {
        citasDAO.save(citas);
    }

    @Override
    public List<Citas> listarCitas() {
        return (List<Citas>) citasDAO.findAll();
    }


}
