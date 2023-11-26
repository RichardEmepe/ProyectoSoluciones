package com.proyecto_clinica.clinica.model.Service.IService;

import java.util.List;

import com.proyecto_clinica.clinica.model.Entidades.Paciente;

public interface IPacienteService {
    public void guardarPaciente(Paciente paciente);
    public List<Paciente> listar();
    public void eliminarPaciente(String DNI);
    public Paciente buscarPaciente(String DNI);
}
