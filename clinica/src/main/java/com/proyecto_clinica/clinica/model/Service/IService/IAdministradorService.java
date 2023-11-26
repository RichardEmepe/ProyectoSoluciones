package com.proyecto_clinica.clinica.model.Service.IService;

import java.util.List;

import com.proyecto_clinica.clinica.model.Entidades.Administradores;

public interface IAdministradorService {
    public void registrarAdministrador(Administradores administradores);
    public List<Administradores> listarAdmin();
    public void eliminarAdmin(Long id);
}