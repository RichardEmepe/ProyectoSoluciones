package com.proyecto_clinica.clinica.model.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto_clinica.clinica.model.DAO.IDoctorDAO;
import com.proyecto_clinica.clinica.model.Entidades.Doctor;
import com.proyecto_clinica.clinica.model.Service.IService.IDoctorService;

@Service
public class DoctorService implements IDoctorService{

    @Autowired
    private IDoctorDAO doctorDAO;

    @Override
    public void registrarDoctor(Doctor doctor) {
        doctorDAO.save(doctor);
    }
    @Override
    public List<Doctor> listarDoctores() {
        return (List<Doctor>) doctorDAO.findAll();
    }
    @Override
    public void eliminarDoctor(Long DNI_DOCTOR) {
        doctorDAO.deleteById(DNI_DOCTOR);
    }

    

    
    
}
