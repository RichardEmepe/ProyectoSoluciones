package com.proyecto_clinica.clinica.model.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto_clinica.clinica.model.DAO.IRolesDAO;
import com.proyecto_clinica.clinica.model.Entidades.Rol;
import com.proyecto_clinica.clinica.model.Service.IService.IRolesService;

@Service
public class RolesService implements IRolesService{

    @Autowired
    private IRolesDAO rolesDAO;

    @Override
    public void asignarRol(Rol rol) {
        rolesDAO.save(rol);
    }
    
}
