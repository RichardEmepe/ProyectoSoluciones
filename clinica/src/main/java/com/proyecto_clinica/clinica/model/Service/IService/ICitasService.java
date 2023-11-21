package com.proyecto_clinica.clinica.model.Service.IService;

import java.util.List;

import com.proyecto_clinica.clinica.model.Entidades.Citas;

public interface ICitasService {
    public void registrarCita(Citas citas);
    public List<Citas> listarCitas();
}
