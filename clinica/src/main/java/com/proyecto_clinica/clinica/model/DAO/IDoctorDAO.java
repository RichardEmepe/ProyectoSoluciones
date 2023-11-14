package com.proyecto_clinica.clinica.model.DAO;

import org.springframework.data.repository.CrudRepository;

import com.proyecto_clinica.clinica.model.Entidades.Doctor;

public interface IDoctorDAO extends CrudRepository<Doctor, Long> {
    
}
