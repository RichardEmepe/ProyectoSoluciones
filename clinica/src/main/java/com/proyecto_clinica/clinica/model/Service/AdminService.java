package com.proyecto_clinica.clinica.model.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proyecto_clinica.clinica.model.DAO.IAdministradorDAO;
// import com.proyecto_clinica.clinica.model.DAO.IAdministradorDAO;
import com.proyecto_clinica.clinica.model.Entidades.Administradores;
import com.proyecto_clinica.clinica.model.Entidades.Rol;

@Service("AdminService")
public class AdminService implements UserDetailsService{
    
    @Autowired
    private IAdministradorDAO administradorDAO;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Administradores adm = administradorDAO.findByUsername(username);
        List<GrantedAuthority> listaRoles = new ArrayList<>();

        for(Rol item : adm.getRoles()){
            listaRoles.add(new SimpleGrantedAuthority(item.getNombre()));
        }

        return new User(adm.getUsername(), adm.getPassword(), listaRoles);
    }



}
