package com.proyecto_clinica.clinica.model.Service;

import java.util.List;

import com.proyecto_clinica.clinica.model.Entidades.Paciente;

public interface IPacienteService {
    public void guardarPaciente(Paciente paciente);
    public List<Paciente> listar();
    public void eliminarPaciente(Long DNI);
    public Paciente buscarPaciente(Long DNI);
}
