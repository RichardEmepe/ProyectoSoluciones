package com.proyecto_clinica.clinica.model.DAO;

import org.springframework.data.repository.CrudRepository;

import com.proyecto_clinica.clinica.model.Entidades.Citas;

public interface ICitasDAO extends CrudRepository<Citas, Long>{
    
}
