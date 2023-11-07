package com.proyecto_clinica.clinica.model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto_clinica.clinica.model.DAO.IPacientesDAO;
import com.proyecto_clinica.clinica.model.Entidades.Paciente;

@Service
public class PacienteService implements IPacienteService{

    @Autowired
    private IPacientesDAO pacientesDAO;

    @Override
    public void guardarPaciente(Paciente paciente) {
        pacientesDAO.save(paciente);
    }

    @Override
    public List<Paciente> listar() {
        return (List<Paciente>) pacientesDAO.findAll();
    }

    @Override
    public void eliminarPaciente(Long DNI) {
        pacientesDAO.deleteById(DNI);
    }

    @Override
    public Paciente buscarPaciente(Long DNI) {
        return pacientesDAO.findById(DNI).orElse(null);
    }
    
}
