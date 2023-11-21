package com.proyecto_clinica.clinica.model.DAO;

import org.springframework.data.repository.CrudRepository;

import com.proyecto_clinica.clinica.model.Entidades.Solicitudes;

public interface ISolicitudDAO extends CrudRepository<Solicitudes, Long>{
    
}
