package com.proyecto_clinica.clinica.model.DAO;

import org.springframework.data.repository.CrudRepository;

import com.proyecto_clinica.clinica.model.Entidades.Paciente;

public interface IPacientesDAO extends CrudRepository<Paciente, Long>{
    
}
