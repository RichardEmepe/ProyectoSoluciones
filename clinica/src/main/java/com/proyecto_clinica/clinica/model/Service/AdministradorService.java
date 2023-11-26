package com.proyecto_clinica.clinica.model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.proyecto_clinica.clinica.model.DAO.IAdminsDAO;
import com.proyecto_clinica.clinica.model.Entidades.Administradores;
import com.proyecto_clinica.clinica.model.Service.IService.IAdministradorService;

@Service
public class AdministradorService implements IAdministradorService{

    @Autowired
    private IAdminsDAO adminsDAO;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void registrarAdministrador(Administradores administradores) {
        String contraseñaEncriptada = passwordEncoder.encode(administradores.getPassword());

        administradores.setPassword(contraseñaEncriptada);

        adminsDAO.save(administradores);
    }

    @Override
    public List<Administradores> listarAdmin() {
        return (List<Administradores>) adminsDAO.findAll();
    }

    @Override
    public void eliminarAdmin(Long id) {
        adminsDAO.deleteById(id);
    }
    
}
