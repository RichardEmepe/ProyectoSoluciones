package com.proyecto_clinica.clinica.model.Service.IService;

import java.util.List;

import com.proyecto_clinica.clinica.model.Entidades.Doctor;

public interface IDoctorService {
    public void registrarDoctor(Doctor doctor);
    public List<Doctor> listarDoctores();
    public void eliminarDoctor(Long DNI_DOCTOR);
}
