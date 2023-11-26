package com.proyecto_clinica.clinica.model.DAO;

import org.springframework.data.repository.CrudRepository;

import com.proyecto_clinica.clinica.model.Entidades.Administradores;

public interface IAdministradorDAO extends CrudRepository<Administradores, Long>{
    public Administradores findByUsername(String username);
}
